package imprimirnome;
import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Informe o número limite: ");
        int limite = entrada.nextInt();
        
        int i = 0;
        
        do {
            System.out.println(nome);
            
            i++;
        } while (i < limite);
    }
}
