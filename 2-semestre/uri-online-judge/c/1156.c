#include <stdio.h>

int main() {
    double s = 1, i, aux = 2;

    for (i = 3; i <= 39; i+=2) {
        s += i / aux;
        aux *= 2;
    }

    printf("%.2f\n", s);

    return 0;
}
