import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        String palavra1, palavra2, palavra3;
        
        Scanner entrada = new Scanner(System.in);
        
        palavra1 = entrada.nextLine();
        palavra2 = entrada.nextLine();
        palavra3 = entrada.nextLine();
        
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.printf("aguia\n");
                } else if (palavra3.equals("onivoro")) {
                    System.out.printf("pomba\n");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.printf("homem\n");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.printf("vaca\n");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.printf("pulga\n");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.printf("lagarta\n");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.printf("sanguessuga\n");
                } else if (palavra3.equals("onivoro")) {
                    System.out.printf("minhoca\n");
                }
            }
        }
    }
}
