package prj_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PRJ_Collection {
    public static void main(String[] args) {
        //lista finita com 10 posições
        String nomes[]=new String[10];
        
        Stack<Integer> Pilha=new Stack<>();
        Pilha.add(5);
        Pilha.add(new Integer(15));
        Pilha.add( Integer.parseInt("30"));
        
        System.out.println(Pilha);
        
        List<Integer> arraylist=
                new ArrayList<>();
        
        arraylist.add(5);
        arraylist.add(15);
        arraylist.add(30);
        
        // como imprimir ????
        
        System.out.println("lista:"+arraylist.toString());
        System.out.println("Lista:"+(arraylist.toArray()).toString() );
       
        //Programação Funcional
        for(int x: arraylist)
        {
            System.out.println(x);
        }
        
        
    }
    
}
