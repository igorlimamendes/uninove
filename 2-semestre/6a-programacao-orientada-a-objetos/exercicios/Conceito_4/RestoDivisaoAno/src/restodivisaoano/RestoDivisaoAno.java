package restodivisaoano;

import java.util.Scanner;

public class RestoDivisaoAno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite um ano (ex, 1960): ");
        double ano = entrada.nextInt();
        double resto = ano % 4;
        
        System.out.println("Resto da divisão de " + ano + " por 4: " + resto);
    }
}
