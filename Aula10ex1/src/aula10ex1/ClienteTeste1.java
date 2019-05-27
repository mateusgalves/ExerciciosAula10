
import java.util.Scanner;

public class ClienteTeste1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Código do Cliente: ");
        String c1 = ler.nextLine();

        

        System.out.println("Nome do Cliente: ");
        String n1 = ler.nextLine();
        
        ClienteEx3 c = new ClienteEx3(c1);
        
        c.ImprimeCodigo(c1);
        c.ImprimeNome(n1);

    }

}
