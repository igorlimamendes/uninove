import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valUniPeca1, valUniPeca2, total;
        
        Scanner entrada = new Scanner(System.in);
    
        codPeca1 = entrada.nextInt();
        numPeca1 = entrada.nextInt();
        valUniPeca1 = entrada.nextDouble();
        codPeca2 = entrada.nextInt();
        numPeca2 = entrada.nextInt();
        valUniPeca2 = entrada.nextDouble();
        
        total = (numPeca1 * valUniPeca1) + (numPeca2 * valUniPeca2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
