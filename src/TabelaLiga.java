public class TabelaLiga {
    private Jogo jogo;
    private Times times;
    private Time campeão;
    private int rodadas;
    private Jogos jogos;
    private Pontos pontos;

    public TabelaLiga(){
        jogo = new Jogo();
        times = new Times();
        campeão = null;
        rodadas = 0;
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


    // Método que organiza a liga.
    public void organizaLiga(){
        criaJogos();
        int b = 0;
        while (b < times.getArray().size()){
            System.out.println(times.getTime(b).getNome() + " | " + pontos.getPonto(times.getTime(b)));
            b = b+1;
        }
    }


    public void criaJogos(){
        int b = 0;
        int c = 0;
        while (b < times.getArray().size()){
            //System.out.println("Jogos na casa do(a) " + times.getArray().get(b).getNome());
            while (c < times.getArray().size()){
                if (c != b){ 
                   jogo.setTime(times.getArray().get(b), times.getArray().get(c));
                   jogo.setGols(jogo.criaAleatorio2(), jogo.criaAleatorio2());
                   //System.out.println(jogo.organizaJogo());
                   //System.out.println();
                   jogos.setArrayJogo(jogo);
                   pontos.setPontos(jogo.partida());
                }
                c = c+1;
            }
            c = 0;
            b = b+1;
        }
    }

    public void organizaCampeonato(){
        organizaLiga();
        System.out.println();
        organizaJogos();
    }

    public void organizaJogos(){
        int b = 0;
        int c = 0;
        while (b < times.getArray().size()){
            System.out.println("Jogos na casa do(a) " + times.getArray().get(b).getNome());
            while (c < times.getArray().size()){
                if (c != b){ 
                   jogo.setTime(times.getArray().get(b), times.getArray().get(c));
                   jogo.setGols(jogo.criaAleatorio2(), jogo.criaAleatorio2());
                   System.out.println(jogo.organizaJogo());
                   System.out.println();
                   jogos.setArrayJogo(jogo);
                   pontos.setPontos(jogo.partida());
                }
                c = c+1;
            }
            c = 0;
            b = b+1;
        }
    }
    
}



