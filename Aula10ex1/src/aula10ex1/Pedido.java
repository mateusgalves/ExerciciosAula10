
public class Pedido {

    private String cod;
    private String nom;
    private String desc;

    public Pedido(String cod, String nom, String desc) {
        this.cod = cod;
        this.nom = nom;
        this.desc = desc;
    }

    public void setCodigo(String cd) {
        cod = cd;
    }

    public String getCodigo() {
        return cod;
    }

    public void setNome(String n) {
        nom = n;
    }

    public String getNome() {
        return nom;
    }
    
    public void setDesc(String dc){
        desc = dc;
    }
    public String getDesc(){
        return desc;
    }
    
    public void ImprimePedido (String ip) {
                
         System.out.println ("Nome: " + getNome()); 
         System.out.println ("Descrição do Pedido: " + getDesc());
         
    }
}

