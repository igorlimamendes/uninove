import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int numeroFun, horasTrab;
        double valorHora, salarioTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        numeroFun = entrada.nextInt();
        horasTrab = entrada.nextInt();
        valorHora = entrada.nextDouble();
        salarioTotal = horasTrab * valorHora;
        
        System.out.printf("NUMBER = %d\n", numeroFun);
        System.out.printf("SALARY = U$ %.2f\n", salarioTotal);
    }
}
