
import java.util.Scanner;

public class CarrosPrincipal {

    public static void main(String args[]) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Tipo de Pneu: ");
        String tp = ler.nextLine();

        System.out.println("Fabricante do Pneu: ");
        String fp = ler.nextLine();

        System.out.println("Preço do Pneu R$: ");
        double pp1 = ler.nextDouble();

        Pneu PP = new Pneu(pp1, tp, fp);

        System.out.println("Fabricante do Motor: ");
        String fm1 = ler.nextLine();

        System.out.println("Potência do Motor; ");
        String ptm = ler.nextLine();

        System.out.println("Preço do Motor R$: ");
        double pm = ler.nextDouble();

        Motor m1 = new Motor(ptm, pm, fm1);

        System.out.println("Modelo do Banco: ");
        String mb = ler.nextLine();

        System.out.println("Fabricante do Banco: ");
        String fabB = ler.nextLine();

        System.out.println("Preço do Banco R$: ");
        double Pb1 = ler.nextDouble();
        

        Bancos b1 = new Bancos(Pb1, mb, fabB);
        
        
        
        b1.imprimeModeloBanco(mb);
        b1.imprimePrecoBanco(Pb1);
        b1.imprimeFabBanco(fabB);
        
        m1.ImprimePot(ptm);
        m1.ImprimeFabM(fm1);
        m1.ImprimePrecoM(pm);
        
        PP.imprimeFab(fp);
        PP.imprimeTipo(tp);
        PP.imprimePreco(pp1);
        
         double vtotal;
        vtotal = (Pb1 + pm + pp1);

        System.out.println("Valor Total dos Itens do Carro R$: " + vtotal);
    }
}
