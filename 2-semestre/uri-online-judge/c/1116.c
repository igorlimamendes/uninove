#include <stdio.h>
 
int main() {
    int n, i, x, y;

    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        scanf("%d %d", &x, &y);

        double z = (double)x / (double)y;

        if (y == 0) printf("divisao impossivel\n");
        else printf("%.1f\n", z);
    }
 
    return 0;
}
