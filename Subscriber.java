

public class Subscriber {
    protected String name;  // Nombre del suscriptor
    protected String topic; // Tópico al que está suscrito

    // Constructor para inicializar el nombre y el tópico del suscriptor
    public Subscriber(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    // Método que será sobreescrito en las subclases para recibir el mensaje
    public void receiveMessage(String message) {
        // Este método se implementará en las subclases
        System.out.println(name + " recibe mensaje en " + topic + ": " + message);
    }
}

