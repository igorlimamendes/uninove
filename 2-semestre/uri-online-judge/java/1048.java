import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double salario, reaj15, reaj12, reaj10, reaj7, reaj4;
        
        Scanner entrada = new Scanner(System.in);
        
        salario = entrada.nextDouble();
        
        reaj15 = (salario * 15) / 100;
        reaj12 = (salario * 12) / 100;
        reaj10 = (salario * 10) / 100;
        reaj7 = (salario * 7) / 100;
        reaj4 = (salario * 4) / 100;
        
        if (salario >= 0 && salario <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", salario+reaj15);
            System.out.printf("Reajuste ganho: %.2f\n", reaj15);
            System.out.printf("Em percentual: 15 %%\n");
        } else if (salario >= 400.01 && salario <= 800.00) {
            System.out.printf("Novo salario: %.2f\n", salario+reaj12);
            System.out.printf("Reajuste ganho: %.2f\n", reaj12);
            System.out.printf("Em percentual: 12 %%\n");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            System.out.printf("Novo salario: %.2f\n", salario+reaj10);
            System.out.printf("Reajuste ganho: %.2f\n", reaj10);
            System.out.printf("Em percentual: 10 %%\n");
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            System.out.printf("Novo salario: %.2f\n", salario+reaj7);
            System.out.printf("Reajuste ganho: %.2f\n", reaj7);
            System.out.printf("Em percentual: 7 %%\n");
        } else if (salario > 2000.01) {
            System.out.printf("Novo salario: %.2f\n", salario+reaj4);
            System.out.printf("Reajuste ganho: %.2f\n", reaj4);
            System.out.printf("Em percentual: 4 %%\n");
        }
    }
}
