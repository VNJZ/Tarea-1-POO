import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintStream;

public class follower extends subscriber{
    private PrintStream output;

    //constructor que inicializa el nombre y topico del seguidor
    public follower(String name, String topic, PrintStream output){
        super(name, topic); //llamamos al constructor de la clase base (el suscriber)
        this.output = output;
    }

    //sobrescribimos el metodo para recibir el mensaje y mostrarlo de una forma especifica
    @Override
    public void receiveMessage(String message){
        output.println(name + " " + topic + " " + message);
    }
}