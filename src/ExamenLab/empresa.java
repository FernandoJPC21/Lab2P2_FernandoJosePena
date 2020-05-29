



package ExamenLab;

import java.util.ArrayList;
import java.util.Scanner;

public class empresa {
    protected String nombre;
    static ArrayList<persona> personas;
    Scanner input = new Scanner(System.in);

    public static persona buscar(int codigo, int i){
        if(i<personas.size()){
            if(((Empleado)personas.get(i)).getCodigoEmpleado()==codigo) {
                return personas.get(i);
            }
            else
                return buscar(codigo, i+1);
        }
        return null;
    }

    public void agregar(String nombre, int edad, int codigo, float sueldo,String tipo){
        directivo x  = new directivo(nombre,edad,codigo,sueldo);
        if(buscar(codigo,0) == null){
            switch (tipo) {
                case "Empleado":
                    directivo.empleado.add(new Empleado(nombre,edad,codigo,sueldo));
                    break;
                case "Directivo":
                    directivo.empleado.add(new directivo(nombre,edad,codigo,sueldo));
                    break;
                case "Persona":
                    personas.add(new persona(nombre,edad));
                    break;
                default:
                    System.out.println("Tipo invalido. Intente de nuevo!");
                    break;
            }
}
        else
            System.out.println("Ya ha sido ingresado antes.");
    }

    public int cantidadEmpleados(){
        int cantidad=0;
        for(persona look : personas){
            if(look instanceof Empleado)
                cantidad++;
        }
        return cantidad;
    }

    public int cantidadDirectivo(){
        int cantidad=0;
        for(persona look : personas){
            if(look instanceof directivo)
                cantidad++;
        }
        return cantidad;
    }

}