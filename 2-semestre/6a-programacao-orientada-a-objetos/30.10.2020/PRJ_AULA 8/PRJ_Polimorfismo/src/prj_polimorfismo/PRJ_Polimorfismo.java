package prj_polimorfismo;

import heranca.ClientePJ;
import heranca.ClientePF;
import heranca.ClientePFnotData;

public class PRJ_Polimorfismo {
      public static void main(String[] args) {
        ClientePJ cpj1=new ClientePJ("IBM","Gabriel@ibm.com");
        ClientePF cpf1=new ClientePF("DELL","roberto@dell.com");
        cpj1.imprimir();
        cpf1.imprimir();
        cpf1.validar();
        
        ClientePFnotData cpf2=new ClientePFnotData();
        cpf2.imprimir();
    }
}
