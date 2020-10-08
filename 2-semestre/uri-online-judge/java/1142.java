import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n, x;
        
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        x = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d PUM\n", x, x+1, x+2);
            
            x += 4;
        }
    }
}
