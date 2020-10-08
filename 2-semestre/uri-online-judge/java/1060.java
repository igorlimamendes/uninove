import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double[] valores;
        int totPositivos;
        
        Scanner entrada = new Scanner(System.in);
        
        valores = new double[6];
        totPositivos = 0;

        for (int i = 0; i < 6; i++) {
            valores[i] = entrada.nextDouble();

            if (valores[i] > 0) totPositivos++;
        }
        
        System.out.printf("%d valores positivos\n", totPositivos);
    }
}
