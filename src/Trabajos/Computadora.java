
package Trabajos;


public class Computadora {
    String modelo;
    int numeroSerie;
    int capacidad;
    int tamañoPantalla;
    boolean teclado;
    String procesador;
    String GPU;
    String OS;
    int tiempo;
    int capacidadBateria;
    int Duracion;

    public Computadora(int numeroSerie, int capacidad, int tamañoPantalla, boolean teclado, String procesador, String GPU, String OS, int tiempo,
            int capacidadBateria, int Duracion) {
        this.numeroSerie = numeroSerie;
        this.capacidad = capacidad;
        this.tamañoPantalla = tamañoPantalla;
        this.teclado = teclado;
        this.procesador = procesador;
        this.OS = OS;
        this.tiempo = tiempo;
        this.capacidadBateria = capacidadBateria;
        this.Duracion = Duracion;
        
        if(tamañoPantalla>17 && teclado==true){
            this.GPU="Gamer";
        }
        else{
            this.GPU="Normal";
        }  
        if(capacidad<300 && OS.equals("ChromeOS") && tamañoPantalla<13){
            modelo="Educativa";
}
        else{
            modelo="Gamer";
        }

    }
    
  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }
    
      
}
