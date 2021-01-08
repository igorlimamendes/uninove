import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    double x1, y1, x2, y2, distancia;
    
    Scanner entrada = new Scanner(System.in);
    
    x1 = entrada.nextDouble();
    y1 = entrada.nextDouble();
    x2 = entrada.nextDouble();
    y2 = entrada.nextDouble();
    
    distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    
    System.out.printf("%.4f\n", distancia);
    }
}
