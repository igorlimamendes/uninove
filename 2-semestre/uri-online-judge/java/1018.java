import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int valor;
        double n100, n50, n20, n10, n5, n2, n1;
        
        Scanner entrada = new Scanner(System.in);
        
        valor = entrada.nextInt();
        
        n100 = valor / 100;
        n50 = (valor % 100) / 50;
        n20 = ((valor % 100) % 50) / 20;
        n10 = (((valor % 100) % 50) % 20) / 10;
        n5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        n2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        n1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
        
        System.out.printf("%d\n", valor);
        System.out.printf("%.0f nota(s) de R$ 100,00\n", n100);
        System.out.printf("%.0f nota(s) de R$ 50,00\n", n50);
        System.out.printf("%.0f nota(s) de R$ 20,00\n", n20);
        System.out.printf("%.0f nota(s) de R$ 10,00\n", n10);
        System.out.printf("%.0f nota(s) de R$ 5,00\n", n5);
        System.out.printf("%.0f nota(s) de R$ 2,00\n", n2);
        System.out.printf("%.0f nota(s) de R$ 1,00\n", n1);
    }
}
