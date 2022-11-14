import java.util.ArrayList;

public class Pontos {
    private ArrayList<Ponto> pontos;

    public Pontos(){
        pontos = new ArrayList<>();
    }

    public ArrayList<Ponto> getPontosList(){
        return pontos;
    }

    public void setPontos(Time t){
        int b = 0;
        while(b < pontos.size()){
            if(pontos.get(b).getTeam() == t){
                pontos.get(b).setPoint();
                b = pontos.size();
            }
            else {b = b+1;}
        }
    }


    // Método que retorna os pontos de um time da lista de pontos/time.
    public int getPonto(Time team){
        int b = 0;
        int c = 0;
        while (b < pontos.size()){
            if (pontos.get(b).getTeam() == team){
                c = pontos.get(b).getPoint();
                b = pontos.size();
            }
            else{b = b+1;}
        }
        return c;
    }
}
