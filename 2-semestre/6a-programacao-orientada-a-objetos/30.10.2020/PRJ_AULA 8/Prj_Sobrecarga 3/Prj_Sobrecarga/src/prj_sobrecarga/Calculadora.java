
package prj_sobrecarga;

public class Calculadora {
    //SOBRECARGA: funções com o mesmo nome - MAS -com 
    // retornos de tipagens diferentes
    
  
    int PI, C32, C9, C5 ;
    
    Calculadora() // Loading
   {
        
        System.out.println("Loading-carregando a calculadora");
        this.PI = 6;
        C32=32;
        C9 = 9;
        C5= 5;
       
   }
    
    
    public int soma(int a,int b){
        return a+b;
    }    
    
    public float soma(float a,float b){
        return a+b;
    }
    
    public int somaPI(int a){
        return a+ PI;
    }
    public float somaPI(float a){
        return a+PI;
    }
    
    public double somaPI(double a){
        return a+PI;
    }
   
    public void CelsiusToFar(float x)
    {
        System.out.println(((x * C9 / C5) + C32 ));
        
    }
    
    //EXERCICIO QUE FIZEMOS 23/10 - AULA 7
    // modificador 
    public int subtracao(int a , int b){
        return a-b;
    }
    
    public float subtracao(float a , float b){
        return a-b;
    }
    
    public double subtracao(double a , double b){
        return a-b;
    }
    
    // AULA 7 MATÉRIA
    //CASTING mudança de tipos de variáveis
    // nome, endereço, número
    public double subtracao (String a, String b){
        double c;
        c= Double.parseDouble(a) - Double.parseDouble(b);
       // c = Integer.parseInt(a) - Integer.parseInt(b);
       //c = Float.parseFloat(a) - Float.parseFloat(b);
        return c;
    }
    
    public double subtracao(double a, int b, float c, String d)
    {
        
        double total;
        total = a - Double.parseDouble(b+"")- Double.parseDouble(c+"")-
                Double.parseDouble(d);
        return total;
    }
    
    public double subtracao (Object a, Object b)
    {
        double c;
        System.out.println("a="+a.toString());
        System.out.println("b="+b.toString());
        c =  Double.parseDouble( a+"")  
             - Double.parseDouble(b+"");
        return c;
    }
    
    public Object soma(Object a,Object b){
        double c=0;
        try{
	c= Double.parseDouble(a+"")+
		  Double.parseDouble(b.toString());
        }catch(Exception e){System.out.println("Erro:"+e);}
        return c;
}



     //================================
    // EXEMPLO DE CONCATENAÇÃO DE STRINGS
    // "Rolfi","Luz"
    public String subtracaoL (String a, String b){
        String c;
        c= a + b;
        return c;
    }
    //"2.03.0"
    // RolfiLuz
}
