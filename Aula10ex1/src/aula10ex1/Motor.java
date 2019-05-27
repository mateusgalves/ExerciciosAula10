
public class Motor {

    private String potencia;
    private double precoMotor;
    private String fabMotor;

    public Motor(String potencia, double precoMotor, String fabMotor) {

        this.potencia = potencia;
        this.precoMotor = precoMotor;
        this.fabMotor = fabMotor;
    }

    public void setPotencia(String pt) {
        potencia = pt;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPrecoMotor(double pm) {
        precoMotor = pm;
    }

    public double getPrecoMotor() {
        return precoMotor;
    }

    public void setFabMotor(String fm){
     fabMotor = fm;   
    }
    public String getFabMotor(){
        return fabMotor;        
    }
    
    
    
    public void ImprimePot(String ip1){
        System.out.println(ip1);
    }
    public void ImprimePrecoM(double ipm){
        System.out.println(ipm);        
    }
    public void ImprimeFabM(String ifm){
        System.out.println(ifm);
    }
    

}
