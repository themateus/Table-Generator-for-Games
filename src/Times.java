import java.util.ArrayList;

public class Times {
    private ArrayList<Time> times;

    // Construtor
    public Times(){
        times = new ArrayList<>();
    }


    // Método que retorna a Lista de times.
    public ArrayList<Time> getArray(){
        return times;
    }

    // Método que retorna o time da posição b.
    public Time getTime(int b){
        return times.get(b);
    }
}
