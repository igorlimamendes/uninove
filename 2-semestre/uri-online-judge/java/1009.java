import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        String nomeVendedor;
        double salarioFixo, totalVendas, totalSalario;
        
        Scanner entrada = new Scanner(System.in);
        
        nomeVendedor = entrada.nextLine();
        salarioFixo = entrada.nextDouble();
        totalVendas = entrada.nextDouble();
        totalSalario = ((totalVendas * 15) / 100) + salarioFixo;
        
        System.out.printf("TOTAL = R$ %.2f\n", totalSalario);
    }
}
