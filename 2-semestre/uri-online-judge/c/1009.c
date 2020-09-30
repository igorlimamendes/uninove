#include <stdio.h>
 
int main() {
    char nomeVendedor;
    double salarioFixo, totVendas, bonus;
    
    scanf("%s", &nomeVendedor);
    scanf("%lf", &salarioFixo);
    scanf("%lf", &totVendas);
    bonus = (salarioFixo) + (totVendas * 15) / 100;
    
    printf("TOTAL = R$ %.2lf\n", bonus);
    
    return 0;
}
