public class Ponto {
    private Time time;
    private int pontos;

    // Construtor
    public Ponto(Time t){
        time = t;
        pontos = 0;
    }
    //

    // Métodos que pegam os atributos do obj ponto.
    public Time getTeam(){
        return time;
    }
    
    public int getPoint(){
        return pontos;
    }
    //

    // Métodos que alteram os atributos do obj ponto.
    public void setPoint(){
        pontos = addPoint();
    }

    public void setTeam(Time team){
        time = team;
    }
    //

    // Método que define a alteração de pontos a cada vitória.
    public int addPoint(){
        int p = pontos;
        return p + 3;
    }
}
