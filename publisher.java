public class publisher {
    private String name; //nombre del streamer
    private String topic; //topico donde se publica


//inicializar el nombre y topico
public publisher(String name, String topic){
    this.name = name;
    this.topic = topic;
}

//getter para acceder al nombre y topico
public String getName(){
    return name;
}

public String getTopic() {
    return topic;
}

//metodo para publicar un mensaje en el topico
public void publish(String message){
    //simulacion publicacion de un mensaje en el topico
    System.out.println("publicador"+name+""+topic);
    System.out.println(message); //imprime el msg publicado
}
}



