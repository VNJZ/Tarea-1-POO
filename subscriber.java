public class subscriber {
    protected String name;  //nombre del suscriptor
    protected String topic; //topico al que esta suscrito

    //constructor para inicializar el nombre y el topico del suscriptor
    public subscriber(String name, String topic){
        this.name = name;
        this.topic = topic;
    }

    //metodo que sera sobreescrito en las subclases para recibir el mensaje
    public void receiveMessage(String message){
        //este metodo se implementara en las subclases
        System.out.println(name + "recibe mensaje en" + topic + ":" + message);

    }
}
