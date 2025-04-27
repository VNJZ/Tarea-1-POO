import java.util.ArrayList;

public class broker {
    private ArrayList<subscriber> subscribers = new ArrayList<>();  // lista de suscriptores

    // metodo para agregar un suscriptor a la lista
    public void addSubscriber(subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // metodo para enviar un mensaje a todos los suscriptores
    public void sendMessage(String message) {
        for (subscriber sub : subscribers) {
            sub.receiveMessage(message);  // llamamos al método de recibir mensaje de cada suscriptor
        }
    }
}
