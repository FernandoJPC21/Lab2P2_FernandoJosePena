
package Semana1;

import java.util.Scanner;




public final class Ejercicio1Tarea2 {
    public static void main(String[] args) {
        String palabra;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la palabra que desea verificar:");
         palabra = input.next();
         Ejercicio1Tarea2 x = new Ejercicio1Tarea2();
       
         if(x.palindromo(palabra)){
             System.out.println("la palabra:"+palabra+" si es palindroma.");
             
         }
         else{
             System.out.println("la palabra:"+palabra+" no es palindroma");
         }  
        
        
        
        
        
        
        
        
        
    }
    
    
    
    public static boolean palindromo (String si){
        if(si.length() == 0 || si.length() == 1){
          return true;  
        }
             
        if(si.charAt(0) == si.charAt(si.length()-1)){
          return palindromo(si.substring(1, si.length()-1));  
        }
        
         return false;
         
    }
    
    
   
        
        
        
    
}
