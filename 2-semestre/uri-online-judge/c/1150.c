#include <stdio.h>
#include <stdbool.h>

int main() {
    int x, z, s = 0, c = 0;
    bool flag = false;

    scanf("%d %d", &x, &z);

    while (z <= x) scanf("%d", &z);

    while (flag == false) {
        s += x;
        x++;
        c++;

        if (s > z) flag = true;
    }

    printf("%d\n", c);

    return 0;
}
