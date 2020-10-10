package projeto_poo_exemplos;

public class Projeto_Poo_Exemplos {

    public static void main(String[] args) {
        // Pizza p1=new Pizza();
        // p1.preco = 32;
        // p1.sabor = "Marguerita";
        
        // V E R D E - instância ou objeto
        Pizza p1=new Pizza("Marguerita", 32);
        Pizza p2=new Pizza("Calabresa", 32);
        
        Carro c1 = new Carro("Volks", "fusca");
        Carro c2 = new Carro("GM", "celta");
        Carro c3 = new Carro("Renault", "Sandero");
        c3 = new Carro("GM", "Jeep");
        
        c3.setMarca("XYZ");
        System.out.println("A marca é " + c3.getMarca());
        
        System.out.println("Pizza: " + p1.getPreco());
        p1.setPreco(0);
        System.out.println("Pizza: " + p1.getPreco());
    }    
}
