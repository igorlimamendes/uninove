package heranca;

import heranca.Cliente;
import heranca.Cliente;

public class ClientePJ extends Cliente {
    
    public ClientePJ(String nomeaux,String emailaux)
    {
        this.nome=nomeaux;
        this.email=emailaux;
    }
    
    
    @Override
    public void imprimir()
    {
        System.out.println("Cliente PJ");
        System.out.println("Empresa:"+nome);
        System.out.println("Contato:"+ email);
    }
    
}
