
package pacoteAnime;


public class X extends Inimigo 
        implements Comportamento,Brinde {

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pulaBrinde() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("Comendo peixe");
    
    }
    
}
