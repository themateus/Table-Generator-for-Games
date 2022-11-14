import java.util.ArrayList;

public class Jogos {
    private ArrayList<Jogo> jogos;
    private ArrayList<Jogo> jogosPassados;

    //Construtor.
    public Jogos(){
        jogos = new ArrayList<>();
        jogosPassados = new ArrayList<>();
    }

    // Método que retorna a lista de jogos.
    public ArrayList<Jogo> getJogos(){
        return jogos;
    }

    public ArrayList<Jogo> getJogosPassados(){
        return jogosPassados;
    }

    // Método que adiciona um jogo na lista de jogos.
    public void setArrayJogo(Jogo jogo){
        if (jogo == null){}
        if ((jogo.getTime1() == null) || (jogo.getTime2() == null)){}
        else {jogos.add(jogo);}
    }

    public void setArrayJogoPassado(Jogo jogo){
        if (jogo == null){}
        if ((jogo.getTime1() == null) || (jogo.getTime2() == null)){}
        else {jogosPassados.add(jogo);}
    }

}
