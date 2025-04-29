public class subscriber {
    protected String name;
    protected String topic;

    public subscriber(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message) {
        // Método que se sobrescribirá
    }
}