import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n;
        
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}
