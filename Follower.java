import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Follower extends Subscriber {
    private String outputFile; // Agregamos el atributo

    // Constructor: inicializa nombre, tópico y archivo de salida
    public Follower(String name, String topic) {
        super(name, topic);
        this.outputFile = name.toLowerCase() + ".txt";  // Ej: seguidor_1.txt
    }

    @Override
    public void receiveMessage(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
