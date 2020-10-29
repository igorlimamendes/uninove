#include <stdio.h>
 
int main() {
    int arr[20], i, j;

    for (i = 19; i >= 0; i--) {
        scanf("%d", &arr[i]);
    }

    for (j = 0; j < 20; j++) {
        printf("N[%d] = %d\n", j, arr[j]);
    }

    return 0;
}
