package Etapa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de un publicador (streamer)
        Publisher streamer = new Publisher("Streamer_1", "Notificaciones_1");
        
        // Crear una instancia de los suscriptores (seguidores)
        Follower follower1 = new Follower("Seguidor_1", "Notificaciones_1");
        Follower follower2 = new Follower("Seguidor_2", "Notificaciones_1");

        // Crear un Broker para gestionar los suscriptores
        Broker broker = new Broker();
        broker.addSubscriber(follower1);  // Agregar seguidor 1
        broker.addSubscriber(follower2);  // Agregar seguidor 2

        // Crear un Scanner para leer mensajes del teclado
        Scanner scanner = new Scanner(System.in);

        // El streamer (publicador) publica un mensaje
        System.out.println("Escribe un mensaje para que el streamer lo publique:");
        String message = scanner.nextLine();  // Leemos el mensaje ingresado por el usuario
        streamer.publish(message);  // El streamer publica el mensaje

        // El broker distribuye el mensaje a todos los seguidores
        broker.sendMessage(message);  // El broker envía el mensaje a los seguidores

        // Cerrar el scanner
        scanner.close();
    }
}
