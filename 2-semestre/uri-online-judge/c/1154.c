#include <stdio.h>
#include <stdbool.h>

int main() {
    bool flag = false;
    int idades, contador = 0;
    double total = 0;

    while (flag == false) {
        scanf("%d", &idades);

        if (idades < 0) {
            flag = true;
        } else {
            total += idades;
            contador++;
        }
    }

    total /= contador;

    printf("%.2f\n", total);

    return 0;
}
