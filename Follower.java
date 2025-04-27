package Etapa1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Follower extends Subscriber {
    // Constructor que inicializa el nombre y tópico del seguidor
    public Follower(String name, String topic) {
        super(name, topic); // Llamamos al constructor de la clase base (Subscriber)
    }

    // Sobrescribimos el método para recibir el mensaje y mostrarlo de una forma específica
    @Override
    public void receiveMessage(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name.toLowerCase() + ".txt", true))) {
            // Escribe el mensaje en el archivo
            writer.write(message);
            writer.newLine(); // Salto de línea
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
