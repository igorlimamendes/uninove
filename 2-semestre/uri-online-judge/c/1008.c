#include <stdio.h>

int main() {
    int numeroFun, horasTrab;
    double valorHora, salario;
    
    scanf("%d", &numeroFun);
    scanf("%d", &horasTrab);
    scanf("%lf", &valorHora);
    salario = horasTrab * valorHora;
    
    printf("NUMBER = %d\n", numeroFun);
    printf("SALARY = U$ %.2lf\n", salario);
    
    return 0;
}
