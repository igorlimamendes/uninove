#include <stdio.h>
 
int main() {
    double salario, reaj15, reaj12, reaj10, reaj7, reaj4;
        
    scanf("%lf", &salario);
        
    reaj15 = (salario * 15) / 100;
    reaj12 = (salario * 12) / 100;
    reaj10 = (salario * 10) / 100;
    reaj7 = (salario * 7) / 100;
    reaj4 = (salario * 4) / 100;
    
    if (salario >= 0 && salario <= 400.00) {
        printf("Novo salario: %.2f\n", salario+reaj15);
        printf("Reajuste ganho: %.2f\n", reaj15);
        printf("Em percentual: 15 %%\n");
    } else if (salario >= 400.01 && salario <= 800.00) {
        printf("Novo salario: %.2f\n", salario+reaj12);
        printf("Reajuste ganho: %.2f\n", reaj12);
        printf("Em percentual: 12 %%\n");
    } else if (salario >= 800.01 && salario <= 1200.00) {
        printf("Novo salario: %.2f\n", salario+reaj10);
        printf("Reajuste ganho: %.2f\n", reaj10);
        printf("Em percentual: 10 %%\n");
    } else if (salario >= 1200.01 && salario <= 2000.00) {
        printf("Novo salario: %.2f\n", salario+reaj7);
        printf("Reajuste ganho: %.2f\n", reaj7);
        printf("Em percentual: 7 %%\n");
    } else if (salario > 2000.01) {
        printf("Novo salario: %.2f\n", salario+reaj4);
        printf("Reajuste ganho: %.2f\n", reaj4);
        printf("Em percentual: 4 %%\n");
    }
    
    return 0;
}
