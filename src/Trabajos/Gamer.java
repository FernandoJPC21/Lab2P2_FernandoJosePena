
package Trabajos;
import java.util.Scanner;


public final class Gamer extends Computadora{
    Scanner input = new Scanner (System.in);
    String numeroSerieA[];
    double precioboleto;
    int numero;
    

    public Gamer(String[] numeroSerieA, double precioboleto, int numero, int numeroSerie, int capacidad, int tamañoPantalla, boolean teclado, String procesador, String GPU, String OS, int tiempo, int capacidadBateria, int Duracion) {
        super(numeroSerie, capacidad, tamañoPantalla, teclado, procesador, GPU, OS, tiempo, capacidadBateria, Duracion);
        this.numeroSerieA = numeroSerieA;
        this.precioboleto = precioboleto;
        this.numero = numero;
    }
    
    

    public void AgregarPC(){
         for(int i=0; i<numeroSerieA.length; i++){
            if(numeroSerieA[i]!=null){
                System.out.print("numero de serie de la PC: ");
                String modelo=input.next();
                numeroSerieA[i]=modelo;
                System.out.println("Se agrego la PC.");
                numero++;
                i=numeroSerieA.length;
            }
        }
    }
    
    
   
    public String modeloPC(){
        return modelo;
    }
    
    
    public String Info(){
        return "Cantidad de computadoras agregadas: "+numero;
    }
    
    public String listaComputadoras(int i){
        if(i<numeroSerieA.length){
            System.out.println("computadora: "+numeroSerieA[i]);
            i++;
            return listaComputadoras(i);        
        }
        return null;
    }


   
        
    
    
}

