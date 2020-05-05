
package Semana1;




import java.util.Scanner;

public class ejercicio1 {
    
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int opcion;
      System.out.println("\nACTIVDAD 1\n");
      
      do{
      
          System.out.println("\n\ningrese opcion:");
      System.out.println("1.Llenar el arreglo.\n2.Ordenar de forma burbuja.\n3.Busqueda lineal.\n4.Busqueda binaria.\n5.salir del sistema.");
      opcion=input.nextInt();
  
    
        switch(opcion){
            case 1:
                int limite=100;
               int []espacios=new int [5];
               for(int i=0;i<espacios.length;i++){
                   for(int j=0;j<=limite;j++){
                        espacios[i]=(int) (Math.random()*limite);
                        
                        }
                   }
                
                    
                 break;
            case 2:
                System.out.println("Ordenamiento burbuja\n\n");
                
                
                break;
            case 3:
                System.out.println("\nbusqueda Lineal\n\n");
                System.out.println("ingrese el numero que quiere buscar:");
                int buscar;
                buscar = input.nextInt();
                
                
                
                
                break;
   }
  }while(opcion!=5); 
    }
}