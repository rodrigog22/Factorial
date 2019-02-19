/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionfactorial;

/**
 *
 * @author Rodrigo
 */
public class SolucionFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial");
        System.out.println(String.format("El factorial de 3 es %d",FactorialN(3)));
        // System.out.println(""+FactorialN(5));
        
    }
    
    
    static int FactorialN(int n)
    {
       int acum=1;
      
       while(n>0)
       {
           acum=acum*n;
           n--;
       }
        n=acum;
        return n;
    }
    
}
