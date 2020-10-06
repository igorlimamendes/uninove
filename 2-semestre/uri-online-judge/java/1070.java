import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int x;
        
        Scanner entrada = new Scanner(System.in);
        
        x = entrada.nextInt();
        
        
        for (int i = x; i < x + 12; i++) {
            if (i % 2 == 1) System.out.printf("%d\n", i);
        }
    }
}
