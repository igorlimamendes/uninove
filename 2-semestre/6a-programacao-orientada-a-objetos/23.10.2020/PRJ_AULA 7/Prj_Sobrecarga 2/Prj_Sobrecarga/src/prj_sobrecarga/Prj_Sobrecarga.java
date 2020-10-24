package prj_sobrecarga;


public class Prj_Sobrecarga {
    
    public static void main(String[] args) {
        
        // Calculadora AMARELA
        Calculadora Calc;
        
        Calc=new Calculadora();// INSTANCIA - copia VERDE
        
        int a=Calc.soma(5, 5);
        double x=5d;
        float b=Calc.soma(5f, 6.6f);
        
        System.out.println("A:"+a);        
        System.out.println("B:"+b);
        
        System.out.println("PI in:" + Calc.somaPI(5));        
        System.out.println("PI fl:" + Calc.somaPI(5.6f));             
        System.out.println("PI fl:" + Calc.somaPI(5.6d));
        Calc.CelsiusToFar(50);
        
        Calc=null;//nulo
        //Garbage Collector
       
        Calculadora X= new Calculadora();// construtor"load"/classe
        
        System.out.println("Subtração:" + X.subtracao(5.0f,5.0d));
         
        java.util.Scanner teclado = 
                new java.util.Scanner(System.in);
        
        System.out.println("Object:" + X.subtracao("12.0", 5 ));
        
        System.out.println("Object soma:" + X.soma("1", 2.0d));
       
        /* //Exemplo com String
        System.out.println("Valor 1:");
        String arg1= teclado.nextLine();
        System.out.println("Valor 2:");
        String arg2= teclado.nextLine();
        
        System.out.println("String:" + X.subtracao(arg1, arg2));
        */
        //TELA frm=new TELA();
        //frm.setVisible(true);
       
    }
    
}
