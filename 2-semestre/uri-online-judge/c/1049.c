#include <stdio.h>
#include <string.h> 

int main() {
    char palavra1[15];
    char palavra2[15];
    char palavra3[15];
        
    scanf("%s", palavra1);
    scanf("%s", palavra2);
    scanf("%s", palavra3);
        
    if (0 == strcmp(palavra1, "vertebrado")) {
        if (0 == strcmp(palavra2, "ave")) {
            if (0 == strcmp(palavra3, "carnivoro")) {
                printf("aguia\n");
            } else if (0 == strcmp(palavra3, "onivoro")) {
                printf("pomba\n");
            }
        } else if (0 == strcmp(palavra2, "mamifero")) {
            if (0 == strcmp(palavra3, "onivoro")) {
                printf("homem\n");
            } else if (0 == strcmp(palavra3, "herbivoro")) {
                printf("vaca\n");
            }
        }
    } else if (0 == strcmp(palavra1, "invertebrado")) {
        if (0 == strcmp(palavra2, "inseto")) {
            if (0 == strcmp(palavra3, "hematofago")) {
                printf("pulga\n");
            } else if (0 == strcmp(palavra3, "herbivoro")) {
                printf("lagarta\n");
            }
        } else if (0 == strcmp(palavra2, "anelideo")) {
            if (0 == strcmp(palavra3, "hematofago")) {
                printf("sanguessuga\n");
            } else if (0 == strcmp(palavra3, "onivoro")) {
                printf("minhoca\n");
            }
        }
    }
 
    return 0;
}
