import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Publisher streamer = new Publisher("Streamer_1", "Notificaciones_1");

        Follower follower = new Follower("Seguidor_1", "Notificaciones_1");

        Broker broker = new Broker();
        broker.addSubscriber(follower);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un mensaje para que el streamer lo publique:");
        String message = scanner.nextLine().trim(); // Elimina espacios vacíos al inicio/final

        if (!message.isEmpty()) {
            String finalMessage = streamer.getName() + " " + message;
            streamer.publish(message); 
            broker.sendMessage(finalMessage);
        } else {
            System.out.println("No se ingresó un mensaje válido.");
        }

        scanner.close(); // Ahora sí cerramos el scanner porque termina el programa
    }
}
