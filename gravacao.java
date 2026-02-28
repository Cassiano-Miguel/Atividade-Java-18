public class gravacao extends biblioteca {

    private String titulo;
    private String midia;

    public gravacao (int numeroCatalogo, int numeroDeCopias, String titulo, String midia){

        super(numeroCatalogo, numeroDeCopias);
        this.titulo = titulo;
        this.midia = midia;
    }
    
    @Override
    public String toString() {
        return "Gravação -> " + super.toString() + ", Título: " + titulo + ", Mídia: " + midia;
    }
}
