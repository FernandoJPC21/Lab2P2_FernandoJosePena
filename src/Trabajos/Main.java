
package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public ArrayList<Computadora> computadora; 
    
    
    
     public Computadora agregarElemento(int NumeroSerie){
     for(Computadora B:computadora){
         if(B.getModelo().equals(NumeroSerie)){
             return B;
         }
     }
     return null;
 }
    
    public static void agregarPC(String tipo){
     Scanner input=new Scanner(System.in);
     input.useDelimiter("\n");
     if(tipo.equals("GAMER")){
         System.out.println("Numero de serie de la PC: ");
         int NumeroSerie=input.nextInt();
         if(agregarElemento(NumeroSerie)==null){
             agregarElemento(NumeroSerie);
         }
         else{
             System.out.println("Esta computadora ya existe.");
         }
     }
     else if(tipo.equals("NORMAL")){
         System.out.println("Numero de Serie de la PC: ");
        int numeroSerie=input.nextInt();
         if(agregarElemento(numeroSerie)==null){
             agregarElemento(numeroSerie);
         }
         else{
             System.out.println("Esta computadora ya existe.");
         }
     }
     
 }
    
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        
        System.out.println("***COMPUTADORAS DELL***");
        System.out.println("Eliga su opcion:\n1.Crear computadora\n2.listar computadoras.\n3.modificar computadoras.\n4.Borrar.");
        int opcion=input.nextInt();
        switch(opcion){
            case 1:
                System.out.println("***CREAR COMPUTADORA***");
                System.out.println("Ingrese el numero de serie:");
                int numeroSerie=input.nextInt();
                agregarElemento(numeroSerie);
                break;
               
        }
    }
}
