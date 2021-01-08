import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int totDistancia;
        double litrosGasto, total;
        
        Scanner entrada = new Scanner(System.in);
        
        totDistancia = entrada.nextInt();
        litrosGasto = entrada.nextDouble();
        
        total = totDistancia / litrosGasto;
        
        System.out.printf("%.3f km/l\n", total);
    }
}
