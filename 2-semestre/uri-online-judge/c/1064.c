#include <stdio.h>

int main() {
    double val1, val2, val3, val4, val5, val6, totPositivos, totPositivosSoma;
    
    scanf("%lf", &val1);
    scanf("%lf", &val2);
    scanf("%lf", &val3);
    scanf("%lf", &val4);
    scanf("%lf", &val5);
    scanf("%lf", &val6);

    totPositivos = 0;
    totPositivosSoma = 0;

    if (val1 > 0) {
        totPositivos++;
        totPositivosSoma += val1;
    }
    
    if (val2 > 0) {
        totPositivos++;
        totPositivosSoma += val2;
    }
    
    if (val3 > 0) {
        totPositivos++;
        totPositivosSoma += val3;
    } 
    
    if (val4 > 0) {
        totPositivos++;
        totPositivosSoma += val4;
    } 
    
    if (val5 > 0) {
        totPositivos++;
        totPositivosSoma += val5;
    } 
    
    if (val6 > 0) {
        totPositivos++;
        totPositivosSoma += val6;
    } 

    totPositivosSoma = totPositivosSoma / totPositivos;

    printf("%.0f valores positivos\n", totPositivos);
    printf("%.1f\n", totPositivosSoma);
    
    return 0;
}
