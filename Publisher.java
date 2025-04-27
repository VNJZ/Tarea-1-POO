package Etapa1;

public class Publisher {
    private String name; // Nombre del streamer
    private String topic; // Tópico donde se publica

    // Inicializar el nombre y tópico
    public Publisher(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    // Getter para acceder al nombre y tópico
    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    // Método para publicar un mensaje en el tópico
    public void publish(String message) {
        // Simulación de publicación de un mensaje en el tópico
        System.out.println("publicador " + name + " " + topic);
        System.out.println(message); // Imprime el mensaje publicado
    }
}
