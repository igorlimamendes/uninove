package moedas;
import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe um valor em moeda (ex: 0,01 - 0,05 - 0,10): ");
        double moeda = entrada.nextDouble();
        
        if (moeda == 0.01) System.out.println("Moeda de 1 Centavo");
        else if (moeda == 0.05) System.out.println("Moeda de 5 Centavos");
        else if (moeda == 0.10) System.out.println("Moeda de 10 Centavos");
        else if (moeda == 0.25) System.out.println("Moeda de 25 Centavos");
        else if (moeda == 0.50) System.out.println("Moeda de 50 Centavos");
        else if (moeda == 1) System.out.println("Moeda de 1 Real");
        else System.out.println("valor inválido");
    }
}
