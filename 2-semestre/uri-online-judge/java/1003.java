import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int a, b, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        soma = a + b;
        
        System.out.printf("SOMA = %d\n", soma);
    }
}
