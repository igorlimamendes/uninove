import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int x;
        
        Scanner entrada = new Scanner(System.in);
        
        x = entrada.nextInt();
        
        for (int i = 1; i <= x; i += 2) {
            System.out.printf("%d\n", i);
        }
    }
}
