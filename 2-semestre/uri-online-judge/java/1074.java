import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n, seguinte;
    
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        for (int i = 0; i < n; i++) {
            seguinte = entrada.nextInt();
            
            if (seguinte == 0) System.out.printf("NULL\n");
            else if (seguinte % 2 == 0 && seguinte > 0) System.out.printf("EVEN POSITIVE\n");
            else if (seguinte % 2 == 0 && seguinte < 0) System.out.printf("EVEN NEGATIVE\n");
            else if (seguinte % 2 != 0 && seguinte > 0) System.out.printf("ODD POSITIVE\n");
            else if (seguinte % 2 != 0 && seguinte < 0) System.out.printf("ODD NEGATIVE\n");
        }
    }
}
