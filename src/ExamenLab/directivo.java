
package ExamenLab;
 import java.util.ArrayList;


   

public class directivo extends Empleado{

    static ArrayList<persona> empleado;

    public directivo(String nombre, int edad, int codigo, double sueldo) {
        super(nombre, edad, codigo, sueldo);
    }

   


    @Override
    public String toString(){
        if(empleado.size() > 0){
            for(int i = 0; i < empleado.size(); i++){
                if(empleado.get(i) instanceof directivo){
                    return "Directivo: {"+super.toString() + "}";
                }
                else
                    return "Empleado ("+ super.toString() + ")";
            }
        }
        return null;
    }

}

