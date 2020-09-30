import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double valor, valorMoedas;
        int valorInt, n100, n50, n20, n10, n5, n2, m1, m050, m025, m010, m005, m001;

        Scanner entrada = new Scanner(System.in);
		
        valor = entrada.nextDouble();

        valorInt = (int)valor;
        valorMoedas = valor - valorInt;
        valorMoedas = Math.round(valorMoedas * 100);
        
        n100 = valorInt / 100;
        n50 = (valorInt % 100) / 50;
        n20 = ((valorInt % 100) % 50) / 20;
        n10 = (((valorInt % 100) % 50) % 20) / 10;
        n5 = ((((valorInt % 100) % 50) % 20) % 10) / 5;
        n2 = (((((valorInt % 100) % 50) % 20) % 10) % 5) / 2;
        
        m1 = (((((valorInt % 100) % 50) % 20) % 10) % 5) % 2;
        m050 = (int)valorMoedas / 50;
        m025 = ((int)valorMoedas % 50) / 25;
        m010 = (((int)valorMoedas % 50) % 25) / 10;
        m005 = ((((int)valorMoedas % 50) % 25) % 10) / 5;
        m001 = ((((int)valorMoedas % 50) % 25) % 10) % 5;
        
        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", m050);
        System.out.printf("%d moeda(s) de R$ 0.25\n", m025);
        System.out.printf("%d moeda(s) de R$ 0.10\n", m010);
        System.out.printf("%d moeda(s) de R$ 0.05\n", m005);
        System.out.printf("%d moeda(s) de R$ 0.01\n", m001);
    }
}
