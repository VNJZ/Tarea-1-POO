import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
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
        String component;
        String componentName;
        String topicName;
        String fileName=null;
        component = in.next();
        componentName = in.next();
        topicName = in.next();
        if(component.equals("publicador")) // it must be a publisher for a well structured config file
            gps = new publisher(componentName, broker, topicName);
        component = in.next();
        String componentType = in.next();
        componentName = in.next();
        topicName = in.next();
        try {
            if (component.equals("suscriptor")) { // it must be a subscriber in stage 2
                fileName = in.next();
                if (componentType.equals("Registrador")) { // it must be a monitor in stage 2
                    recorder recorder =new recorder(componentName,topicName,new PrintStream(fileName));
                    broker.subscribe(recorder);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File: " + fileName);
            System.exit(-1);
        }
    }
    public void runSimulation() {
        Scanner inputEvent = new Scanner(System.in);
        System.out.println("Escribe un mensaje: ");
        while (inputEvent.hasNextLine()) {
            String message = inputEvent.nextLine();
            gps.publishNewEvent(message);
        }
    }
    private publisher gps;
}
