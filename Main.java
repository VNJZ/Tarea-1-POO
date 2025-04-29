import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private broker broker;
    private ArrayList<publisher> publishers = new ArrayList<>();

    public static void main (String args[]) {
        if (args.length != 1) {
            System.out.println("Usage: java T1Stage2 <configurationFile.txt>");
            System.exit(-1);
        }

        Scanner in = null;
        try {
            in = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File: " + args[0]);
            System.exit(-1);
        }

        main stage = new main();
        stage.setupSimulator(in);
        stage.runSimulation();
    }

    public void setupSimulator(Scanner in) {  // create main objects from configuration file
        broker broker = new broker();

        while (in.hasNext()) {
            String component = in.next();
            if (component.equals("publicador")) {
                String componentName = in.next();
                String topicName = in.next();
                publisher pub = new publisher(componentName, broker, topicName);
                publishers.add(pub);
            } else if (component.equals("suscriptor")) {
                String type = in.next();
                String componentName = in.next();
                String topicName = in.next();
                String fileName = in.next();
                try {
                    if (type.equals("Seguidor")) {
                        follower f = new follower(componentName, topicName, new PrintStream(fileName));
                        broker.subscribe(f);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("File: " + fileName);
                    System.exit(-1);
                }
            }
        }
    }
    public void runSimulation() {
        System.out.println("Ingresa el nombre del streamer y la notificación de stream");
        Scanner inputEvent = new Scanner(System.in);
        while (inputEvent.hasNextLine()) {
            String line = inputEvent.nextLine().trim();
            if (line.isEmpty()) continue;

            int firstSpace = line.indexOf(' ');
            if (firstSpace == -1) {
                System.out.println("Formato inválido. Debe ser: <publicador> <mensaje>");
                continue;
            }

            String publisherName = line.substring(0, firstSpace);
            String message = line.substring(firstSpace + 1);

            publisher found = null;
            for (publisher pub : publishers) {
                if (pub.getName().equals(publisherName)) {
                    found = pub;
                    break;
                }
            }

            if (found != null) {
                found.publishNewEvent(message);
            } else {
                System.out.println("Unknown Publisher");
            }
        }
    }
}
