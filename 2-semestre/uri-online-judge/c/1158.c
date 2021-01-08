#include <stdio.h>

int main() {
    int n, x, y, i, j, s;

    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        scanf("%d %d", &x, &y);
        
        s = 0;

        for (j = 0; j < y; j++) {
            if (x % 2 != 0) s += x;
            else s += x+1;
            
            x += 2;
        }

        printf("%d\n", s);
    }

    return 0;
}
