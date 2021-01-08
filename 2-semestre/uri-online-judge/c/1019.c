#include <stdio.h>

int main() {
    int segEvento, horas, minutos, segundos;
    
    scanf("%d", &segEvento);
    horas = ((segEvento / 60) / 60) % 60;
    minutos = (segEvento / 60) % 60;
    segundos = segEvento % 60;
    
    printf("%d:%d:%d\n", horas, minutos, segundos);
    
    return 0;
}
