import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double a, b, c, ladoA, ladoB, ladoC;
        
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        if (a >= b && a >= c) {
            ladoA = a;
            
            if (b >= c) {
                ladoB = b;
                ladoC = c;
            } else {
                ladoB = c;
                ladoC = b;
            }
        } else if (b >= a && b >= c) {
            ladoA = b;
            
            if (a >= c) {
                ladoB = a;
                ladoC = c;
            } else {
                ladoB = c;
                ladoC = a;
            }
        } else {
            ladoA = c;
            
            if (a >= b) {
                ladoB = a;
                ladoC = b;
            } else {
                ladoB = b;
                ladoC = a;
            }
        }
        
        if (ladoA >= (ladoB + ladoC)) {
            System.out.printf("NAO FORMA TRIANGULO\n");
        } else if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
            System.out.printf("TRIANGULO OBTUSANGULO\n");
        }
        
        if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) System.out.printf("TRIANGULO RETANGULO\n");
        if (ladoA * ladoA < ladoB * ladoB + ladoC * ladoC) System.out.printf("TRIANGULO ACUTANGULO\n");
        if (ladoA == ladoB && ladoB == ladoC) System.out.printf("TRIANGULO EQUILATERO\n");
        if (ladoA == ladoB && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA) System.out.printf("TRIANGULO ISOSCELES\n");
    }
}
