

import java.util.ArrayList;

public class Broker {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();  // Lista de suscriptores

    // Método para agregar un suscriptor a la lista
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Método para enviar un mensaje a todos los suscriptores
    public void sendMessage(String message) {
        for (Subscriber sub : subscribers) {
            sub.receiveMessage(message);  // Llamamos al método de recibir mensaje de cada suscriptor
        }
    }
}


