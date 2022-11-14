public class Ponto {
    private Time time;
    private int pontos;

    public Ponto(Time t){
        time = t;
        pontos = 0;
    }

    public Time getTeam(){
        return time;
    }
    
    public int getPoint(){
        return pontos;
    }

    public int addPoint(){
        int p = pontos;
        return p + 3;
    }

    public void setPoint(){
        pontos = addPoint();
    }

    public void setTeam(Time team){
        time = team;
    }
}
