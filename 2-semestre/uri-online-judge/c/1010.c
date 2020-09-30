#include <stdio.h>

int main() {
    int codPeca1, numPeca1, codPeca2, numPeca2;
    double valUniPeca1, valUniPeca2, totValor;
    
    scanf("%d", &codPeca1);
    scanf("%d", &numPeca1);
    scanf("%lf", &valUniPeca1);
    scanf("%d", &codPeca2);
    scanf("%d", &numPeca2);
    scanf("%lf", &valUniPeca2);
    totValor = (numPeca1 * valUniPeca1) + (numPeca2 * valUniPeca2);
    
    printf("VALOR A PAGAR: R$ %.2lf\n", totValor);
    
    return 0;
}
