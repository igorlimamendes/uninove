#include <stdio.h>

int main() {
    double a, b, c, ladoA, ladoB, ladoC;
    
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);
    
    if (a >= b && a >= c) {
        ladoA = a;
            
        if (b >= c) {
            ladoB = b;
            ladoC = c;
        } else {
            ladoB = c;
            ladoC = b;
        }
    } else if (b >= a && b >= c) {
        ladoA = b;
        
        if (a >= c) {
            ladoB = a;
            ladoC = c;
        } else {
            ladoB = c;
            ladoC = a;
        }
    } else {
        ladoA = c;
        
        if (a >= b) {
            ladoB = a;
            ladoC = b;
        } else {
            ladoB = b;
            ladoC = a;
        }
    }
    
    if (ladoA >= (ladoB + ladoC)) {
        printf("NAO FORMA TRIANGULO\n");
    } else if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
        printf("TRIANGULO OBTUSANGULO\n");
    }
        
    if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) printf("TRIANGULO RETANGULO\n");
    if (ladoA * ladoA < ladoB * ladoB + ladoC * ladoC) printf("TRIANGULO ACUTANGULO\n");
    if (ladoA == ladoB && ladoB == ladoC) printf("TRIANGULO EQUILATERO\n");
    if (ladoA == ladoB && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA) printf("TRIANGULO ISOSCELES\n");
    
    return 0;
}
