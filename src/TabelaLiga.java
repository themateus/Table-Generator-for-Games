import java.util.ArrayList;
import java.util.Collections;

public class TabelaLiga {
    private Jogo jogo;
    private Times times;
    private Jogos jogos;
    private Pontos pontos;

    // Construtor
    public TabelaLiga(){
        jogo = new Jogo();
        times = new Times();
        jogos = new Jogos();
        pontos = new Pontos();
    }
    //

    // Método que gera rodadas.
    public int setRodadas() {
        int n = 0;
        if (times.getArray().size()%2 != 0){
            n = 0;
        }
        else{n = times.getArray().size() - 1;}
        return n;
    }
    //

    // Método que gera times para o campeonato.
    public void setArray(Time time) {
        if (time == null){}
        else{times.getArray().add(time);  
            pontos.getPontosList().add(new Ponto(time));}
    }
    //


    // Método que organiza e ordena a liga.
    public void organizaLiga(){
        criaJogos();
        System.out.println();
        int b = 0;
        ArrayList<Integer> ordena = new ArrayList<>();
        while (b < pontos.getPontosList().size()){
            ordena.add(pontos.getPonto(pontos.getPontosList().get(b).getTeam()));
            b = b +1;
        }
        Collections.sort(ordena);
        int a = ordena.size() -1;
        int c = 0;
        while (a >= 0 ){
            c = ordena.get(a);
            int d = 0;
            while(d < pontos.getPontosList().size()){
                if (c == pontos.getPonto(pontos.getPontosList().get(d).getTeam())){
                    System.out.println(pontos.getPontosList().get(d).getTeam().getNome() + " | " + pontos.getPonto(pontos.getPontosList().get(d).getTeam()));
                    d = d+1;
                }
                else{
                    d = d+1;
                }
            }
            a = a-1;
        }
    }
    //

    // Método que gera e diz quais os jogos da liga, com seus resultados.
    public void criaJogos(){
        int b = 0;
        int c = 0;
        while (b < times.getArray().size()){
            System.out.println("Jogos na casa do(a) " + times.getArray().get(b).getNome());
            while (c < times.getArray().size()){
                if (c != b){ 
                   jogo.setTime(times.getArray().get(b), times.getArray().get(c));
                   jogo.setGols(jogo.criaAleatorio2(), jogo.criaAleatorio2());
                   jogos.setArrayJogo(jogo);
                   pontos.setPontos(jogo.partida());
                   System.out.println(jogo.organizaJogo());
                   System.out.println();
                }
                c = c+1;
            }
            c = 0;
            b = b+1;
        }
    }
    //

    // Método que gera o campeonato no formato de liga nesse caso.
    public void organizaCampeonato(){
        organizaLiga();
        System.out.println();
    }
    //

}


