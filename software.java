public class software extends gravacao {
    
    public int versao;
    public String plataforma;

    public software (int numeroCatalogo, int numeroDeCopias, String titulo, String midia, int versao, String plataforma){

        super(numeroCatalogo, numeroDeCopias, titulo, midia);
        this.versao = versao;
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Software -> " + super.toString()
             + ", Versão: " + versao
             + ", Plataforma: " + plataforma;
    }
}
