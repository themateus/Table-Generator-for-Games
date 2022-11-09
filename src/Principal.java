public class Principal {
    public static void main(String[] args){
        TabelaCopa copa = new TabelaCopa();

        // adicionar times.
        copa.setArray(new Time("BRASIL", "BRA"));
        copa.setArray(new Time("URUGUAI", "URA"));
        copa.setArray(new Time("ALEMANHA", "GER"));
        copa.setArray(new Time("FRANÇA", "FRA"));
        //

        copa.organizaCampeonato();

    }
    
}
