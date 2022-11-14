public class Time{
    private String Nome;
    private String Sigla;

    public Time(String a, String b){
        Nome = a;
        Sigla = b;
    }

    // Métodos que pegam o valor de um atributo do objeto.
    public String getNome(){
        return Nome;
    }

    public String getSigla(){
        return Sigla;
    }
    //

    // Métodos que inserem novos valores de atributos ao objeto.
    public void setNome(String nome){
        Nome = nome;
    }

    public void setSigla(String sigla){
        Sigla = sigla;
    }

    // Método que apresenta o time na tela.
    public String showTime(){
        return Nome + "(" + Sigla + ")";
    }
}