public class publicacao extends biblioteca {
    
    public String titulo;
    public String editor;

    public publicacao (int numeroCatalogo, int numeroDeCopias, String titulo, String editor){
        
        super (numeroCatalogo, numeroCatalogo);
        this.titulo = titulo;
        this.editor = editor;

    }

    @Override
    public String toString() {
        return "Publicação -> " + super.toString() + ", Título: " + titulo + ", Editor: " + editor;
    }
}
