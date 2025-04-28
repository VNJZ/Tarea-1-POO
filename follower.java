import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class follower extends subscriber{
    //constructor que inicializa el nombre y topico del seguidor
    public follower(String name, String topic){
        super(name, topic); //llamamos al constructor de la clase base (el suscriber)
    }

    //sobrescribimos el metodo para recibir el mensaje y mostrarlo de una forma especifica
    @Override
    public void receiveMessage(String message){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name.toLowerCase() + ".txt", true))){
            //se escribe en msg en el archivo
            writer.newLine(); //salto de linea
            writer.write(message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}