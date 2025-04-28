import java.io.PrintStream;

public class recorder extends subscriber {
    private PrintStream output;

    public recorder(String name, String topic, PrintStream output) {
        super(name, topic);
        this.output = output;
    }

    @Override
    public void receiveMessage(String message) {
        String[] parts = message.trim().split("\\s+");
        if (parts.length == 2) {
            String x = parts[0];
            String y = parts[1];
            output.println(name + "," + topic + "," + x + "," + y);
        } else {
            System.out.println("Formato inválido de mensaje recibido: " + message);
        }
    }
}

