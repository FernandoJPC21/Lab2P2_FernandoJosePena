
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
  int []espacios=new int [5];
    
        switch(opcion){
            case 1:
                int limite=10;
               
               for(int i=0;i<espacios.length;i++){
                   for(int j=0;j<espacios.length;j++){
                        espacios[i]=(int) (Math.random()*limite);
                        
                        } 
                   System.out.println(espacios[i]);
                   }
                
                    
                 break;
            case 2:
                System.out.println("Ordenamiento burbuja\n\n");
                for(int i=0;i<espacios.length-1;i++){
                    for(int x=0;x<espacios.length-1;x++){
                        if(espacios[x]>espacios[x+1]){
                           int cambio=espacios[x]; 
                           espacios[x]=espacios[x+1];
                           espacios[x+1]=cambio;
                        }
                    }
                }
                for(int i=0;i<espacios.length;i++){
                  System.out.println(espacios[i]);   
                }
               
                
                break;
            case 3:
                System.out.println("\nBUSQUEDA LINEAL\n");
                boolean encontrado=false;
                System.out.println("\nbusqueda Lineal\n\n");
                System.out.println("ingrese el numero que quiere buscar:");
                int buscar;
                buscar = input.nextInt();
                int inicio=0;
                while(inicio<=6&& encontrado==false ){
                    if(espacios[inicio]==buscar){
                        encontrado=true;
                    }
                    inicio++;
                }
                if(encontrado==false){
                    System.out.println("no se encontro el numero deseado.");
                }
                else{
                    System.out.println("se ha encontrado su numero deseado.");
                }
                
                
                break;
   }
  }while(opcion!=5); 
    }
}