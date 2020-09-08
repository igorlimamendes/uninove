// Nome padrão
var player1 = "Jogador(a) 1";
var player2 = "Jogador(a) 2";

// Função para inserir os nomes dos(as) jogadores(as)
function insertNames() {
    player1 = prompt("Nome jogador(a) 1"); // Imprimir um box na tela para digitar o nome do(a) jogador(a)
    player2 = prompt("Nome jogador(a) 2"); // Imprimir um box na tela para digitar o nome do(a) jogador(a)

    document.querySelector("p.Player1").innerHTML = player1; // Transformar o <p> no nome escolhido pelo usuário
    document.querySelector("p.Player2").innerHTML = player2; // Transformar o <p> no nome escolhido pelo usuário
}

// Placar
var points1 = 9;
var points2 = 9;

// Função para jogar o dado
function dice() {    
    if (points1 < 0 || points2 < 0) {
        alert("Fim de jogo");
    } else if (player1.length <= 0 || player2.length <= 0) {
        alert("Insira os nomes para jogar!")
    } else {
        var randomNumber1 = Math.floor(Math.random() * 6) + 1; // Gerar número randômico
        var randomNumber2 = Math.floor(Math.random() * 6) + 1; // Gerar número randômico

        document.querySelector(".img1").setAttribute("src","dado" + randomNumber1 + ".png"); // Passar o número randômico para imagem
        document.querySelector(".img2").setAttribute("src","dado" + randomNumber2 + ".png"); // Passar o número randômico para imagem
        
        if (randomNumber1 === randomNumber2) {
            document.querySelector("h1").innerHTML = "EMPATE!"; // Colocar no h1 (título) empate
        } else if (randomNumber1 < randomNumber2) {
            document.querySelector("h1").innerHTML = (player2 + " VENCEU!"); // Colocar no h1 (título) vitória e o nome do(a) jogador(a)
            document.querySelector(".points1").innerHTML = (`Pontos: ${points1--}`); // Tirar 1 ponto do perdedor
        } else {
            document.querySelector("h1").innerHTML = (player1 + " VENCEU!"); // Colocar no h1 (título) vitória e o nome do(a) jogador(a)
            document.querySelector(".points2").innerHTML = (`Pontos: ${points2--}`); // Tirar 1 ponto do perdedor
        }
    }
}
