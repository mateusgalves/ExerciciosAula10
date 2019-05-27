import java.util.Scanner;




public class Pedidoteste {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        
        
        
        System.out.println ("Digite o código do Produto: ");
        String c1 = ler.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String n1 = ler.nextLine();
        
        System.out.println ("Digite a descrição do Produto: ");
        String d1 = ler.next();
        
        
                  
                
        
        
         Pedido p = new Pedido(c1, n1, d1);
         p.ImprimePedido(d1);
        
         
    }
    
}
