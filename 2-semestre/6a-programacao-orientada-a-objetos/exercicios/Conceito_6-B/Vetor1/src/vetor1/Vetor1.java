package vetor1;

public class Vetor1 {
    public static void main(String[] args) {
        int [] idades = new int [20];
        
        idades[0] = 35;
        idades[1] = 44;
        idades[2] = 33;
        idades[3] = 22;
        idades[4] = 55;
        idades[5] = 65;
        idades[6] = 7;
        idades[7] = 8;
        idades[8] = 9;
        idades[9] = 10;
        idades[10] = 1;
        idades[11] = 2;
        idades[12] = 13;
        idades[13] = 14;
        idades[14] = 15;
        idades[15] = 16;
        idades[16] = 17;
        idades[17] = 8;
        idades[18] = 19;
        idades[19] = 5;
        
        int i = 0;
        
        do {
            System.out.printf("Idade %d: %d\n", i+1, idades[i]);
            
            i++;
        } while (i < 20);
    }
}
