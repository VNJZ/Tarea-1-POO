public class publisher {
    private String name;
    private broker broker;
    private String topic;

    public publisher(String name, broker broker, String topic) {
        this.name = name;
        this.broker = broker;
        this.topic = topic;
    }

    public void publishNewEvent(String message) {
        broker.publish(topic, message.trim());
    }

    public String getName() {
        return name;
    }
}


