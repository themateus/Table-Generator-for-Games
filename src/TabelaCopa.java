public class TabelaCopa {
    private Times times;
    private Jogo jogo;
    private Time campeão;
    private int rodadas;

    public TabelaCopa(){
        times = new Times();
        jogo = new Jogo();
        campeão = null;
        rodadas = -1;
    }

    // Métodos que pegam os atributos do objeto TabelaCopa.
    public Times getTimes(){
        return times;
    }

    public Jogo getJogo(){
        return jogo;
    }

    public Time getTime(){
        return campeão;
    }

    public int getRodadas(){
        return rodadas;
    }
    //

    // Método que adiciona time na lista de times.
    public void setArray(Time time){
        times.getArray().add(time);
    }
    //

    // Método que gera rodadas.
    public int setRodadas(){
        int n = 0;
        if (times.getArray().size() > 16) {
            n = -1;
        }
        if (times.getArray().size() == 16){
            n = 4;
        }
        if (times.getArray().size() == 8){
            n = 3;
        }
        if (times.getArray().size() == 4){
            n = 2;
        }
        if (times.getArray().size() == 2){
            n = 1;
        }
        else {rodadas = -1;}
        return n;
    }
    //


    // APRIMORAR AMANHÃ: QUANDO RODADA = 4, VENCEDOR DO JOGO ADICIONADO NA LISTA DOS VENCEDORES DAS QUARTAS.(EXEMPLO, VERIFICAR LÓGICA)
    public void organizaCampeonato(){
        int b = times.getArray().size() - 1;
        if ((times.getArray().size())%2 == 0){
            while (b > 0){
               System.out.println();
               jogo.setTime(times.getArray().get(b), times.getArray().get(b-1));
               jogo.setGols(b, b);
               System.out.println(jogo.organizaJogo());
               System.out.println();
               b = b -2;
            }
        }
        else {System.out.println("\nSó da pra criar copa com 16, 8, 4 ou 2 times.\n");}
    }

}
