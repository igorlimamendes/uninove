package heranca;

import heranca.Cliente;

public class ClientePF extends Cliente {
    public ClientePF(String nomeaux,String emailaux)
    {
        this.nome=nomeaux;
        this.email=emailaux;
    }
    
    public void validar(){
        System.out.println("Validando");
    } 
    
}
