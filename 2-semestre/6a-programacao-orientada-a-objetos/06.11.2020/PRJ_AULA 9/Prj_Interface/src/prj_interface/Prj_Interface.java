package prj_interface;

public class Prj_Interface {

   
    public static void main(String[] args) {
        ClientePJ pj=new ClientePJ();
        ClientePF pf=new ClientePF();
        
        pj.imprimir();
        pf.imprimir();
        
        pacoteAnime.Heroi hr=
                new pacoteAnime.Heroi();
        
        pacoteABSTRACT.Fusca fu=new 
                pacoteABSTRACT.Fusca();
        
        
        System.out.println(fu.getModelo());
        fu.setLigar(false);
        fu.freioABS();
        
        
        pacoteABSTRACT.Palio pl=new 
        pacoteABSTRACT.Palio();
        
        
        System.out.println(pl.getModelo());
        pl.setLigar(true);
        pl.freioABS();
        
        pacoteABSTRACT.Carro
                cr=new pacoteABSTRACT.Duster();
        
        System.out.println(cr.getModelo());
        cr.setLigar(true);
        cr.freioABS();
        
    }
    
}
