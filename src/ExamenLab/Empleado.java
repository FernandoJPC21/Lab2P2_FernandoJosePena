

package ExamenLab;

public class Empleado extends persona {

    public Empleado(String nombre, int edad, int codigoEmpleado, double sueldoMensual) {
        super(nombre, edad);
    }

    private int codigo;
    private double sueldo;

    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.codigo = CodigoEmpleado;
    }

    public int getCodigoEmpleado(){
        return codigo;
    }

    public void setSueldoMensual(double sueldoMensual){
        this.sueldo = sueldoMensual;
    }

    public double getSueldoMensual(){
        return sueldo;
    }

    public String toString(){
        return "Codigo de empleado: " + codigo + super.toString() + " ,Salario: " + sueldo;
    }
}