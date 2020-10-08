#include <stdio.h>

int main() {
    double val1, val2, val3, val4, val5, val6, totPositivos;
    
    scanf("%lf", &val1);
    scanf("%lf", &val2);
    scanf("%lf", &val3);
    scanf("%lf", &val4);
    scanf("%lf", &val5);
    scanf("%lf", &val6);

    totPositivos = 0;

    if (val1 > 0) totPositivos++;
    if (val2 > 0) totPositivos++;
    if (val3 > 0) totPositivos++;
    if (val4 > 0) totPositivos++;
    if (val5 > 0) totPositivos++;
    if (val6 > 0) totPositivos++;

    printf("%.0f valores positivos\n", totPositivos);
    
    return 0;
}
