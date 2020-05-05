
package Semana1;




import java.util.Scanner;

public class ejercicio1 {
    
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int opcion;
      System.out.println("\nACTIVDAD 1\n");
      System.out.println("ingrese opcion:");
      System.out.println("1.Llenar el arreglo.\n2.Ordenar de forma burbuja.\n3.Busqueda lineal.\n4.Busqueda binaria.\n5.salir del sistema.");
      opcion=input.nextInt();
  
    do{
        switch(opcion){
            case 1:
                int cantidad=1000;
                boolean llenar=false;
                int numeros[]=new int[1000];
                
                if(llenar=false){
                    for(int i=0;i<numeros.length-1;i++){
                        llenar=true;
                        numeros[i]=(int) (Math.random()*cantidad);
                        for(int x=0;x<i;x++){
                            if(numeros[i]==numeros[x]){
                                i--;
                            }
                        }
                    } 
                   
                }
               
                 
      
      
    break;
   }
  }while(opcion!=5); 
    }
}