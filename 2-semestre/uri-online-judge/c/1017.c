#include <stdio.h>
 
int main() {
    double tempoGasto, veloMedia, litrosNec;
    
    scanf("%lf", &tempoGasto);
    scanf("%lf", &veloMedia);
    litrosNec = (tempoGasto * veloMedia) / 12;
    
    printf("%.3lf\n", litrosNec);
    
    return 0;
}
