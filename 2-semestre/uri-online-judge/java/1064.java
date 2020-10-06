import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double val1, val2, val3, val4, val5, val6, totPositivos, totPositivosSoma;

        Scanner entrada = new Scanner(System.in);

        val1 = entrada.nextDouble();
        val2 = entrada.nextDouble();
        val3 = entrada.nextDouble();
        val4 = entrada.nextDouble();
        val5 = entrada.nextDouble();
        val6 = entrada.nextDouble();

        totPositivos = 0;
        totPositivosSoma = 0;

        if (val1 > 0) {
            totPositivos++;
            totPositivosSoma += val1;
        }
        
        if (val2 > 0) {
            totPositivos++;
            totPositivosSoma += val2;
        }
        
        if (val3 > 0) {
            totPositivos++;
            totPositivosSoma += val3;
        } 
        
        if (val4 > 0) {
            totPositivos++;
            totPositivosSoma += val4;
        } 
        
        if (val5 > 0) {
            totPositivos++;
            totPositivosSoma += val5;
        } 
        
        if (val6 > 0) {
            totPositivos++;
            totPositivosSoma += val6;
        } 

        totPositivosSoma = totPositivosSoma / totPositivos;

        System.out.printf("%.0f valores positivos\n", totPositivos);
        System.out.printf("%.1f\n", totPositivosSoma);
    }
}
