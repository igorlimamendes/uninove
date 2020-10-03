// 1º pasta ou pacote - prj_helloworld; nome da pasta ou pacote
package prj_helloworld;

/* 
    2º a biblioteca ou pacote - import
    java.util.Scanner; - teclas do pc
*/
import java.util.Scanner;

// 3º linha o NOME DA CLASSE
public class Prj_HelloWorld {
    // 4º Funções
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        System.out.println("1-" + soma(2, 3));
        System.out.println("1-" + soma(2, 6));
        soma2(2, 3);
    }
    
    // Função - metodo
    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
    // PROCEDURE - função sem retorno
    public static void soma2(int numero1, int numero2) {
        int numero = numero1 + numero2;
    }
}
