
package Semana1;

import java.util.Scanner;



    
public class Ejercicio2Tarea2 {
    
    
  

    
    
    
    private static int numeros(int suma[][],int i,int j)
{
    if(i==0 && j==0){
        return suma[i][j];
    }
    else if(j==0){
        return numeros(suma,i-1,suma.length-1)+suma[i][j];
    }
    else{
        return numeros(suma,i,j-1)+suma[i][j];
    }
    
} 
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n;
        System.out.println("ingrese la cantidad de filas y columnas:");
        n=input.nextInt();
      numeros(suma[n][n],2,3); 
   
    
        
        
        
        
        
        
        
        
    }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
          

    