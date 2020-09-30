import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		float n1, n2, n3, n4, nExame, media;
		
        Scanner entrada = new Scanner(System.in);

        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		
		if (media >= 7.0) {
			 System.out.printf("Media: %.1f\n", media);
			 System.out.printf("Aluno aprovado.\n");
		} else if (media >= 5.0 && media <= 6.9) {	
			nExame = entrada.nextFloat();

            System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno em exame.\n");
            System.out.printf("Nota do exame: %.1f\n", nExame);

			media = (media + nExame) / 2;
			
			if (media >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.print("Aluno reprovado.\n");
			}
			
            System.out.printf("Media final: %.1f\n", media);
		} else {
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno reprovado.\n");
		}
    }
}
