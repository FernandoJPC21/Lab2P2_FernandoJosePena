
package ExamenLab;

public class persona {
    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public void setEdad(int age) {
        this.edad = age;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " }";
    }
}


