
package ExamenLab;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        empresa a = new empresa();
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        boolean salir=false;
        int opcion;
        String tipo = "";
        String nombre = "";
        int edad = 0;
        int codigoEmpleado = 0;
        float sueldoMensual = 0;

        do{
            System.out.println("\n***EMPRESA***\n");
                    
            System.out.println("Ingrese una opcion:");
            System.out.println("\n1.Agregar personal.\n2.Cantidad de empleados.\n3.Cantidad de directivos.\n4.Buscar empleado o directivo.\n5.Salir.\n");
            System.out.print("Sleccione una Opcion: ");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\nAgregar Personal\n");
                    System.out.print("Ingrese el tipo:(Empleado,Directivo o Persona)");
                    tipo=input.next().toUpperCase();
                    System.out.print("Ingrese el Nombre: ");
                    nombre=input.next();
                    System.out.print("Ingrese la Edad: ");
                    edad=input.nextInt();
                    System.out.print("INgrese el Codigo: ");
                    codigoEmpleado=input.nextInt();
                    System.out.print("Ingrese el Sueldo: ");
                    sueldoMensual=input.nextFloat();
                    a.agregar(nombre, edad, codigoEmpleado, sueldoMensual, tipo);
                    break;
                case 2:
                    System.out.println("\n***CANTIDAD DE EMPLEADOS***\n");
                    System.out.println("cantidad de empleados: "+a.cantidadEmpleados());
                    break;
                case 3:
                    System.out.println("\n***CANTIDAD DE DIRECTIVOS***\n");
                    System.out.println("Cantidad de directivos: "+a.cantidadDirectivo());
                    break;
                case 4:
                    System.out.println("\n***BUSCAR PERSONA***\n");
                    System.out.println("Ingrese el codigo para buscarlo: ");
                    int codigo=input.nextInt();
                    System.out.println(empresa.buscar(codigo, 0));
                    break;
                case 5:
                    System.out.println("\nsaliendo del sistema...");
                    salir = true;
                    break;
            }

        }while(!salir);
    }
}
