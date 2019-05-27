
public class Pneu {
    private double precoPneu;
    private String tipoPneu;
    private String fabric;
    
    public Pneu (double precoPneu, String tipoPneu, String fabric){
        this.precoPneu = precoPneu;
        this.tipoPneu = tipoPneu;
        this.fabric = fabric;
    }

    Pneu(String tp, String fp, double pp1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setPrecoPneu(double pp){
        precoPneu = pp;
    }
    public double getPrecoPneu(){
        return precoPneu;
    }
    
    public void setTipoPneu(String tp){
        tipoPneu = tp;
    }
    public String getTipoPneu(){
        return tipoPneu;
    }
    
    public void setFabric(String fb){
        fabric = fb;
    }
    public String getFabric(){
        return fabric;
    }
     public void imprimePreco(double ip1){
         System.out.println("Preço do Pneu: " + ip1);
              }
     public void imprimeTipo (String itp) {
         System.out.println ("Tipo de Pneu: " + itp);
     }
     public void imprimeFab (String ifb)
     {
         System.out.println("Fabricante: " + ifb);
         
     }    
    
}
