import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int codigo, quantidade;
        double total;
        
        Scanner entrada = new Scanner(System.in);
        
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();
        
        total = 0;
        
        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
