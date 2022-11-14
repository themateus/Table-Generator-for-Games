import java.util.ArrayList;

public class Jogos {
    private ArrayList<Jogo> jogos;

    //Construtor.
    public Jogos(){
        jogos = new ArrayList<>();
    }
    //

    // Método que retorna a lista de jogos.
    public ArrayList<Jogo> getJogos(){
        return jogos;
    }
    //

    // Método que adiciona um jogo na lista de jogos.
    public void setArrayJogo(Jogo jogo){
        if (jogo == null){}
        if ((jogo.getTime1() == null) || (jogo.getTime2() == null)){}
        else {jogos.add(jogo);}
    }
    //

}
