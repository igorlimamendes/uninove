algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 06/04/2020
// Se��o de Declara��es
var
nota: vetor [1..4] de real
media_final: real
x: inteiro

inicio
// Se��o de Comandos
para x de 1 ate 4 passo 1 faca
         escreva(" digite a nota ",x," : ")
         leia(nota[x])
         media_final <- media_final + nota[x]
fimpara
media_final <- media_final / 4
escreval("sua media final eh : ",media_final)
se ( media_final >= 6.0 ) entao
     escreval ( "Parabens voce foi aprovado")
  senao
     escreval ( "Estude, voce esta de recuperacao")
fimse

fimalgoritmo
