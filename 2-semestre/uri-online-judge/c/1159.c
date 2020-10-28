#include <stdio.h>
#include <stdbool.h>

int main() {
    bool flag = false;
    int x, s, i;

    while (flag == false) {
        scanf("%d", &x);

        s = 0;

        if (x != 0) {
            for (i = 0; i < 5; i++) {
                if (x % 2 == 0) s += x;
                else s += x+1;

                x += 2;
            }

            printf("%d\n", s);
        } else flag = true;
    }

    return 0;
}
