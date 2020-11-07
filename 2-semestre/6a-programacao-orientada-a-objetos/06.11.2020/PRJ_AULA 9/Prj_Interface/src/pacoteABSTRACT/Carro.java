package pacoteABSTRACT;

public abstract class Carro {
    
    
    public void setLigar(boolean aux){
        System.out.println("Ligado:"+aux);
    }
    
    public String getModelo()
    {
        return "WOLKS";
    }
    
    public void freioABS()
    {
        System.out.println("FREIO ABS");
    }
    
}
