import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int a, b, c, d, diferenca;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();
        diferenca = (a * b - c * d);
        
        System.out.printf("DIFERENCA = %d\n", diferenca);
    }
}
