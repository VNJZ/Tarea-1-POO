import java.io.PrintStream;

public class monitor extends subscriber {
    private PrintStream output;

    public monitor(String name, String topic, PrintStream output) {
        super(name, topic);
        this.output = output;
    }

    @Override
    public void receiveMessage(String message) {
        output.println(name + " [" + topic + "] recibió: " + message);
    }
}

