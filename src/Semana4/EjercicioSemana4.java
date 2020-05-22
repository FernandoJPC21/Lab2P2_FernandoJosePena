
package Semana4;

import java.util.Scanner;

public class EjercicioSemana4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("EMPRESA\n\n");
        Empresa x =new Empresa("Hola");
        String nombre;
        String apellido;
        String numero;
        int opcion;
        do{
        System.out.println("ingrese la ocpion que desea:\n1.Agregar empleado.\n2.Tabla.\n3.Buscar empleado.");
        opcion=input.nextInt();
        
        
           
            if(opcion==1){
                System.out.println("ingrese el nombre del empleado:");
                nombre=input.next();
                System.out.println("ingrese el apellido:");
                apellido=input.next();
                System.out.println("ingrese el numero social:");
                numero=input.next();
                
                x.agregarEmpleado(nombre, apellido, numero, opcion, opcion, opcion);
            }
            if(opcion==2){
                x.obtenerTotalPlanillaxTipoEmpleado();
            }
            if(opcion==3){
                System.out.println("ingrese el numero del empleado:");
                numero=input.next();
                x.buscarEmpleado(numero);
            }
            
            
            
          if(opcion!=3 && opcion!=2 && opcion!=1){
              System.out.println("Saliendo del sistema...");
          }  
        }while(opcion!=3);
        
       
        
        
        
        
        
        
        
        
    }
  
}
