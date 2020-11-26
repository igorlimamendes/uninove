package vetor3;

public class Vetor3 {
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
        idades[10] = 20;
        idades[11] = 21;
        idades[12] = 31;
        idades[13] = 41;
        idades[14] = 51;
        idades[15] = 61;
        idades[16] = 71;
        idades[17] = 81;
        idades[18] = 91;
        idades[19] = 11;
        
        int i = 0;
        
        while (i < 20) {
            if (idades[i] >= 18) System.out.println("Idade: " + idades[i]);
            
            i++;
        }
    }
}
