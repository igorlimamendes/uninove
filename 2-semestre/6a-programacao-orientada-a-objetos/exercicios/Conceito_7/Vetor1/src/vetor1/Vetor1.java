package vetor1;

public class Vetor1 {
    public static void main(String[] args) {
        int [] idades = new int [20];
        
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        idades[3] = 4;
        idades[4] = 5;
        idades[5] = 6;
        idades[6] = 7;
        idades[7] = 8;
        idades[8] = 9;
        idades[9] = 10;
        idades[10] = 11;
        idades[11] = 12;
        idades[12] = 13;
        idades[13] = 14;
        idades[14] = 15;
        idades[15] = 16;
        idades[16] = 17;
        idades[17] = 18;
        idades[18] = 19;
        idades[19] = 20;
        
        for (int i = 0; i < 20; i++) {
            System.out.printf("Vetor[%d] Idade: %d\n", i, idades[i]);
        }
    }
}
