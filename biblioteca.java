public class biblioteca {

    private int numeroCatalogo;
    private int numeroDeCopias;

    public biblioteca (int numeroCatalogo, int numeroDeCopias){

        this.numeroCatalogo = numeroCatalogo;
        this.numeroDeCopias = numeroDeCopias;
       
    }
    
    public void adquirir() {
        numeroDeCopias++;
    }
    
    public void retornar() {
        numeroDeCopias--;
    }
    
    @Override
    public String toString() {
        return "Numero de Catalogo: " + numeroCatalogo + ", Numero de Copias: " + numeroDeCopias;
    };
}

