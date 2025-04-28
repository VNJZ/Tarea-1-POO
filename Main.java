import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // crear una instancia de un publicador (streamer)
        publisher streamer = new publisher("Streamer_1", "Notificaciones_1");
        
        // crear una instancia de los suscriptores (seguidores)
        follower follower1 = new follower("Seguidor_1", "Notificaciones_1");
        follower follower2 = new follower("Seguidor_2", "Notificaciones_1");

        // crear un Broker para gestionar los suscriptores
        broker broker = new broker();
        broker.addSubscriber(follower1);  // agregar seguidor 1
        broker.addSubscriber(follower2);  // agregar seguidor 2

        // crear un Scanner para leer mensajes del teclado
        Scanner scanner = new Scanner(System.in);

        // el streamer (publicador) publica un mensaje
        System.out.println("Escribe un mensaje para que el streamer lo publique:");
        String message = scanner.nextLine();  // leemos el mensaje ingresado por el usuario
        streamer.publish(message);  // el streamer publica el mensaje

        // el broker distribuye el mensaje a todos los seguidores
        broker.sendMessage(message);  // el broker envía el mensaje a los seguidores

        // cerrar el scanner
        scanner.close();
    }
}
