
package Semana4;

import java.util.ArrayList;
import java.util.Scanner;


public class Empresa {
     private String nombreEmpresa;
    ArrayList<EmpleadoPorComision> empleados;
    
    public Empresa(String nombreE){
        this.nombreEmpresa=nombreE;
        this.empleados = new ArrayList<EmpleadoPorComision>();
    }
    
    public void agregarEmpleado(String nombre,String apellido, String numero,double venta,double tarifa,double salariobase){
        boolean veri=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de empleado?(1.Con salario base/ 2.Sin salario base)");
        int opcion = input.nextInt();
        if(opcion==1){
             for(int i=0;i<empleados.size();i++){
                 if(empleados.get(i).getNumeroSeguroSocial().contains(numero)){
                     veri=true;
                 } 
             }
             if(veri==true){
            empleados.add(new EmpleadoBaseMasComision(nombre,apellido,numero,venta,tarifa));
                 System.out.println("Se agrego el empleado");}
             else if(veri==false)
                 System.out.println("Ya existe ese empleado");
        }
        else if(opcion==2){
            for(int i=0;i<empleados.size();i++){
                 if(empleados.get(i).getNumeroSeguroSocial().contains(numero)){
                     veri=true;
                 } 
             }
            if(veri==true){
            empleados.add(new EmpleadoPorComision(nombre,apellido,numero,venta,tarifa));
                System.out.println("Se agrego el empleado");}
            else if(veri==false)
                System.out.println("Ya existe ese empleado");
        }
        else
            System.out.println("Opcion no valida.");
    }
    
    public void obtenerTotalPlanillaxTipoEmpleado(){
        
    }
    
    public void buscarEmpleado(String numeroSeguroSocial){
          for(int i=0;i<empleados.size();i++){
              if(empleados.get(i).getNumeroSeguroSocial().contains(numeroSeguroSocial))
                  System.out.println(empleados.toString());
          }
    }
    
} 

