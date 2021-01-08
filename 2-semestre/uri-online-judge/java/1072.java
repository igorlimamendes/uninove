import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        int[] valores = new int[n];
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < n; i++) {
            valores[i] = entrada.nextInt();
            
            if (valores[i] >= 10 && valores[i] <= 20) in++;
            else out++;
        }
        
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
