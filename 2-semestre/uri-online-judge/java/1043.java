import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double a, b, c, perimetro, trapezio;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        if ((a < b + c) && (b < a + c) && (c < b + a)) {
            perimetro = a + b + c;
            
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            trapezio = ((a + b) * c) / 2;
            
            System.out.printf("Area = %.1f\n", trapezio);
        }
    }
}
