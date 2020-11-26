package mesmapessoa;
import java.util.Scanner;

public class MesmaPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Informe o 1º nome: ");
        String nome1 = entrada.nextLine();
        System.out.printf("Informe o 2º nome: ");
        String nome2 = entrada.nextLine();
        System.out.printf("Informe a 1ª idade: ");
        int idade1 = entrada.nextInt();
        System.out.printf("Informe a 2ª idade: ");
        int idade2 = entrada.nextInt();
        System.out.printf("Informe o 1º peso (ex, 80): ");
        int peso1 = entrada.nextInt();
        System.out.printf("Informe o 2º peso (ex, 80): ");
        int peso2 = entrada.nextInt();
        
        boolean resultado = idade1 == idade2 && peso1 == peso2 && nome1.equals(nome2);
        
        System.out.println("Usuários identicos: " + resultado);
    }    
}
