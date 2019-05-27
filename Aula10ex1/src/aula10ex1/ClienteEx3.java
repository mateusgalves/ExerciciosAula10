
public class ClienteEx3 {

    private String nome;
    private String Codigo;

    public ClienteEx3(String codigo) {

        this.Codigo = codigo;
    }

    public void setNome(String nom) {
        nome = nom;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String cod) {
        Codigo = cod;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void ImprimeCodigo(String cd) {
        System.out.println("Codígo Cliente: " + cd);
    }

    public void ImprimeNome(String nm) {
        System.out.println("Nome Cliente: " + nm);
    }
    
}
