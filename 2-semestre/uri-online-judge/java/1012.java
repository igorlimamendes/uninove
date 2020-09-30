import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double a, b, c, trianguloRet, circRaio, trapezio, quadrado, retangulo;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        trianguloRet = (a * c) / 2;
        circRaio = (3.14159 * c * c);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f\n", trianguloRet);
        System.out.printf("CIRCULO: %.3f\n", circRaio);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
