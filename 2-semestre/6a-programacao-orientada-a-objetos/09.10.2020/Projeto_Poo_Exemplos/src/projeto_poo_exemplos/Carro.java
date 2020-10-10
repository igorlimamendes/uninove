package projeto_poo_exemplos;

public class Carro {

    // função - método
    public String getMarca() {
        return marca;
    }

    // ENCAPSULAMENTO
    // procedure
    public void setMarca(String marca) {
        this.marca = marca;
    }
    // função - método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private String marca;
    private String nome;

    // aux = auxiliar
    // this = nesta classe
    // Construtor
    Carro(String auxm, String auxn) {
        this.marca = auxm;
        this.nome = auxn;
    }
}
