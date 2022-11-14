public class Principal {
    public static void main(String[] args){
        TabelaCopa copa = new TabelaCopa();

        // adicionar times.
        copa.setArray(new Time("BRASIL", "BRA"));
        copa.setArray(new Time("URUGUAI", "URA"));
        copa.setArray(new Time("ALEMANHA", "GER"));
        copa.setArray(new Time("FRANÇA", "FRA"));
        
        copa.setArray(new Time("iTALIA", "ITA"));
        copa.setArray(new Time("ARGENTINA", "ARG"));
        copa.setArray(new Time("EST.UNIDOS", "EUA"));
        copa.setArray(new Time("RUSSIA", "RUS"));
        
        copa.setArray(new Time("QATAR", "QAT"));
        copa.setArray(new Time("JAPAO", "JAP"));
        copa.setArray(new Time("COREIA SUL", "COR"));
        copa.setArray(new Time("CHINA", "CHI"));
         
        copa.setArray(new Time("BRASIL", "BRA"));
        copa.setArray(new Time("URUGUAI", "URA"));
        copa.setArray(new Time("ALEMANHA", "GER"));
        copa.setArray(new Time("FRANÇA", "FRA"));
        

        copa.organizaCampeonato();

    }
    
}
