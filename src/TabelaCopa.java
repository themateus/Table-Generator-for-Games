public class TabelaCopa {
    private Times times;
    private Jogo jogo;
    private Time campeão;
    private int rodadas;
    private VencedoresCopa vencedores;

    public TabelaCopa(){
        times = new Times();
        jogo = new Jogo();
        campeão = null;
        rodadas = -1;
        vencedores = new VencedoresCopa();
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
        int n = -1;
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


    // APRIMORAR: Fazer os gols serem randômicos. (Fora daqui: criar a classe campeonato.)
    public void organizaCampeonato(){
        rodadas = setRodadas();
        if (rodadas == 4){
            int b = times.getArray().size() - 1;
            System.out.println(" \nOITAVAS DE FINAL!\n ");
            while (b > 0){
               jogo.setTime(times.getArray().get(b), times.getArray().get(b-1));
               jogo.setGols(b, b+1);
               vencedores.setQuartas(jogo.partida());
               System.out.println(jogo.organizaJogo());
               System.out.println();
               if (b == 1){
                  rodadas = 3;
               }
               b = b -2;
            }
        }
        if (rodadas == 3){
            if (times.getArray().size() == 8){
                int b = times.getArray().size() - 1;
                System.out.println(" \nQUARTAS DE FINAL\n ");
                while (b > 0){
                   jogo.setTime(times.getArray().get(b), times.getArray().get(b-1));
                   jogo.setGols(b, b+1);
                   vencedores.setSemi(jogo.partida());
                   System.out.println(jogo.organizaJogo());
                   System.out.println();
                   if (b == 1){
                       rodadas = 2;
                   }
                   b = b -2;
                }
            }
            else {
                int b = vencedores.getQuartas().size() - 1;
                System.out.println(" \nQUARTAS DE FINAL!\n ");
                while (b > 0){
                    jogo.setTime(vencedores.getQuartas().get(b), vencedores.getQuartas().get(b-1));
                    jogo.setGols(b, b+1);
                    vencedores.setSemi(jogo.partida());
                    System.out.println(jogo.organizaJogo());
                    System.out.println();
                    if (b == 1){
                       rodadas = 2;
                    }
                    b = b -2;
                }
            }
        }
        if (rodadas == 2){
            if (times.getArray().size() == 4){
                int b = times.getArray().size() - 1;
                System.out.println(" \nSEMIFINAL\n ");
                while (b > 0){
                   jogo.setTime(times.getArray().get(b), times.getArray().get(b-1));
                   jogo.setGols(b, b+1);
                   vencedores.setFinal(jogo.partida());
                   System.out.println(jogo.organizaJogo());
                   System.out.println();
                   if (b == 1){
                       rodadas = 1;
                   }
                   b = b -2;
                }
            }
            else{
                int b = vencedores.getSemi().size() - 1;
                System.out.println(" \nSEMIFINAL!\n ");
                while (b > 0){
                    jogo.setTime(vencedores.getSemi().get(b), vencedores.getSemi().get(b-1));
                    jogo.setGols(b, b+1);
                    vencedores.setFinal(jogo.partida());
                    System.out.println(jogo.organizaJogo());
                    System.out.println();
                    if (b == 1){
                       rodadas = 1;
                    }
                    b = b -2;
                }
            }
        }
        if (rodadas == 1){
            if (times.getArray().size() == 2){
                int b = times.getArray().size() - 1;
                System.out.println(" \nFINAL!\n ");
                while (b > 0){
                   jogo.setTime(times.getArray().get(b), times.getArray().get(b-1));
                   jogo.setGols(b, b+1);
                   campeão = jogo.partida();
                   System.out.println(jogo.organizaJogo());
                   System.out.println();
                   if (b == 1){
                       rodadas = 99;
                   }
                   b = b -2;
                }
            }
            else{
                int b = vencedores.getFinal().size() - 1;
                System.out.println(" \nFINAL!\n ");
                while (b > 0){
                    jogo.setTime(vencedores.getFinal().get(b), vencedores.getFinal().get(b-1));
                    jogo.setGols(b, b+1);
                    campeão = jogo.partida();
                    System.out.println(jogo.organizaJogo());
                    System.out.println();
                    if (b == 1){
                       rodadas = 99;
                    }
                    b = b -2;
                }
            }
        }
        if (rodadas == 99){
            System.out.println("CAMPEÃO:" + campeão.getNome() + "\n");
        }
        if (rodadas == -1) {System.out.println("\nSó da pra criar copa com 16, 8, 4 ou 2 times. Veja bem quantos times você inseriu!!\n");}
    }

}
