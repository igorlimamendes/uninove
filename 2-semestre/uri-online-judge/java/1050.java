import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        if (n == 61) System.out.printf("Brasilia\n");
        else if (n == 71) System.out.printf("Salvador\n");
        else if (n == 11) System.out.printf("Sao Paulo\n");
        else if (n == 21) System.out.printf("Rio de Janeiro\n");
        else if (n == 32) System.out.printf("Juiz de Fora\n");
        else if (n == 19) System.out.printf("Campinas\n");
        else if (n == 27) System.out.printf("Vitoria\n");
        else if (n == 31) System.out.printf("Belo Horizonte\n");
        else System.out.printf("DDD nao cadastrado\n");
    }
}
