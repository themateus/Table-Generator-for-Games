import java.util.ArrayList;

public class VencedoresCopa {
    private ArrayList<Time> oitavas;
    private ArrayList<Time> quartas;
    private ArrayList<Time> semi;
    private ArrayList<Time> finale;

    public VencedoresCopa(){
        oitavas = new ArrayList<>();
        quartas = new ArrayList<>();
        semi = new ArrayList<>();
        finale = new ArrayList<>();
    }

    // Métodos que pegam as listas das respectivas rodadas.
    public ArrayList<Time> getOitavas(){
        return oitavas;
    }

    public ArrayList<Time> getQuartas(){
        return quartas;
    }

    public ArrayList<Time> getSemi(){
        return semi;
    }

    public ArrayList<Time> getFinal(){
        return finale;
    }
    //

    
    // Métodos que colocam times nas respectivas rodadas.
    public void setOitavas(Time time){
        oitavas.add(time);
    }

    public void setQuartas(Time time){
        quartas.add(time);
    }

    public void setSemi(Time time){
        semi.add(time);
    }

    public void setFinal(Time time){
        finale.add(time);
    }
    //
    
}
