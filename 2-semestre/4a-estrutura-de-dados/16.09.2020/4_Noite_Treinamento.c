#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  // PROGRAMA PAR OU ÍMPAR
  // int numero;
  
  // printf("Informe um número: ");
  // scanf("%d", &numero);

  // numero % 2 == 0 ? printf("O número digitado é: PAR!\n") : printf("O número digitado é: ÍMPAR!\n");

  
  // PROGRAMA USUÁRIO VS COMPUTADOR
  int numero, escolha_Par_Impar, num_Computador, soma;

  printf("Escolha 0 = Par ou 1 = Ímpar: ");
  scanf("%d", &escolha_Par_Impar);

  printf("Digite o seu valor: ");
  scanf("%d", &numero);

  srand(time(NULL));
  num_Computador = rand() % 10;
  // ALTERAR

  if ( (numero + num_Computador ) % 2 == escolha_Par_Impar ) {
    printf("Computador = %d | Vou roubar\n", num_Computador);
    // num_Computador = num_Computador + 1;
    // num_Computador += 1;
    num_Computador++;
  }

  printf("O Computador escolheu o nº: %d\n", num_Computador);
  soma = numero + num_Computador;

  if (soma % 2 == escolha_Par_Impar) {
    printf("Usuário ganhou!\n");
  } else {
    printf("Computador ganhou!\n");
  }

  return 0;
}

// Comentário Inline

/* 
  Comentário Multiline
*/

/* 
  PSEUDOCODIGO         | C
  
  inteiro              | int (%d)
  real                 | float (%f) ou double (%lf)
  caracter             | char (%c)
  cadeia               | char[10]

  escreva("OK")        | printf("OK");
  leia(dia)            | scanf("%d", &dia);
  
  leia(idade, peso)    | scanf("%d%f", &idade, &peso);

  idade: 25 anos.
  escreva("Idade: ", idade, " anos\n")
  printf("Idade: %d anos\n", idade);

  se ( ?? )
  { }
  senao
  { }

  if ( ?? )
  { 

  }
  else
  {

  }
*/
