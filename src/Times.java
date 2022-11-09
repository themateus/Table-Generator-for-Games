import java.util.ArrayList;

public class Times {
    private ArrayList<Time> times;

    public Times(){
        times = new ArrayList<>();
    }


    // Método que retorna a Lista de times.
    public ArrayList<Time> getArray(){
        return times;
    }


    // Método que retorna um time dado uma lista de times e o nome do time.
    public Time getTime(Times times, String a){
        int c = 0;
        Time b = null;
        while (c < times.getArray().size()){
          if (a == times.getArray().get(c).getNome()){
             b = times.getArray().get(c);
             c = c + 1;
          }
          else {c = c +1;}
          }
        return b;
    }

}
