#include <stdio.h>

int main() {
    float i, j, aux;
    int x;

    for (i = 0; i <= 1.9; i += .2) {
        for (aux = 1.0; aux <= 3.0; aux++) {
            j = aux + i;
            
            if (i == 0.0 || i == 1.0) {
                printf("I=%.0lf J=%.0lf\n", i, j);
            } else if (j == 3.0 || j == 4.0 || j == 5.0) {
                printf("I=%.0lf J=%.0lf\n", i, j);
            } else {
                printf("I=%.1lf J=%.1lf\n", i, j);
            }
        }
    }

    for (x = 3; x <= 5; x++) printf("I=2 J=%d\n", x);

    return 0;
}
