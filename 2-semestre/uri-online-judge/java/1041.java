import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double x, y;

        Scanner entrada = new Scanner(System.in);
        
        x = entrada.nextDouble();
        y = entrada.nextDouble();

        if (x == 0 && y == 0) {
            System.out.printf("Origem\n");
        } else if (x == 0 && y != 0) {
            System.out.printf("Eixo Y\n");
        } else if (x != 0 && y == 0) {
            System.out.printf("Eixo X\n");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1\n");
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2\n");
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3\n");
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4\n");
        }
    }
}
