import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double valor, aux, imposto;
        
        Scanner entrada = new Scanner(System.in);
        
        valor = entrada.nextDouble();
        
        if (valor > 0 && valor <= 2000) {
            System.out.printf("Isento\n");
        } else if (valor > 2000 && valor <= 3000) {
            aux = valor - 2000;
            imposto = aux * 0.08;
            
            System.out.printf("R$ %.2f\n", imposto);
        } else if (valor >= 3000 && valor <= 4500) {
            aux = valor - 3000;
            imposto = aux * 0.18 + 1000 * 0.08;
            
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            aux = valor - 4500;
            imposto = aux * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
