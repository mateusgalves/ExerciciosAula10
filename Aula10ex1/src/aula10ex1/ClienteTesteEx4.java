import java.util.Scanner;

public class ClienteTesteEx4 {
    public static void main (String [] args){
        
        Scanner ler = new Scanner (System.in);
        
       
        
      
        String nome1 = ler.nextLine();
        
        
        ClienteEx3 c3 = new ClienteEx3(nome1); 
        c3.ImprimeNome(nome1);
        
        
        
        String nome2 = ler.nextLine();
        
        
        ClienteEx3 c4 = new ClienteEx3(nome2); 
        c4.ImprimeNome(nome2); 
        
    }
    
}
