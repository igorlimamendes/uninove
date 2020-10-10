package projeto_poo_exemplos;

public class Pizza {
    String sabor;
    private float preco;
    
    public void setPreco(float aux) {
        if (aux < 10) return;
        this.preco = aux;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    //Construtor
    Pizza(String auxsabor, float auxpreco) {
        this.sabor = auxsabor;
        this.preco = auxpreco;
    }
}
