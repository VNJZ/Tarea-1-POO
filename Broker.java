import java.util.ArrayList;
import java.util.List;

public class broker {
    private List<subscriber> subscribers = new ArrayList<>();

    public void subscribe(subscriber sub) {
        subscribers.add(sub);
    }

    public void publish(String topic, String message) {
        for (subscriber sub : subscribers) {
            if (sub.getTopic().equals(topic)) {
                sub.receiveMessage(message);
            }
        }
    }
}
