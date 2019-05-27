
public class Bancos {

    private double precoBanco;
    private String modeloBanco;
    private String fabBanco;

    public Bancos(double PrecoBanco, String modeloBanco, String FabBanco) {
        this.precoBanco = precoBanco;
        this.modeloBanco = modeloBanco;
        this.fabBanco = fabBanco;
    }

    public void setPrecoBanco(double pb) {
        precoBanco = pb;
    }

    public double getPrecoBanco() {
        return precoBanco;
    }

    public void setModeloBanco(String mb) {
        modeloBanco = mb;
    }

    public String getModeloBanco() {
        return modeloBanco;
    }

    public void setFabBanco(String fbb) {
        fabBanco = fbb;
    }
    
    public String getFabBanco(){
        return fabBanco;
    }
    
    public void imprimePrecoBanco(double pb1){
        System.out.println(pb1);
    }
    public void imprimeModeloBanco(String mb1){
        System.out.println(mb1);}
    
    public void imprimeFabBanco(String fb1){
        System.out.println(fb1);
    }
}
