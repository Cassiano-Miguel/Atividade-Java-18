import java.util.Date;
public class filme extends gravacao {

    public String diretor;
    public Date dataDeLancamento;
    public String distribuidor;

    public filme (int numeroCatalogo, int numeroDeCopias, String titulo, String midia, String diretor, Date dataDeLancamento, String distribuidor){

        super(numeroCatalogo, numeroDeCopias, titulo, midia);
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.distribuidor = distribuidor;
        
    }

    @Override
    public String toString() {
        return "Filme -> " + super.toString()
             + ", Diretor: " + diretor
             + ", Lançamento: " + dataDeLancamento
             + ", Distribuidor: " + distribuidor;
    }
}
