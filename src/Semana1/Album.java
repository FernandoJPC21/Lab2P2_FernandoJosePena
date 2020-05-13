
package Semana1;

import java.util.ArrayList;


public class Album {
   private String nombre;
   private String FechaPublicacion;
   private String productor;
   private String genero;
   ArrayList pistas = new ArrayList();
   
   
   
   
   
   public Album(String nombre, String FechaPublicacion, String productor, String genero){
     
      
        
    }
   
   
    public void getnombre(String nombre){
        this.nombre=nombre;
         }
    public void setnombre(){
        
    }
    
     public void getFechaPublicacion(String FechaPublicacion){
        this.FechaPublicacion=FechaPublicacion;
         }
    public void setFechaPublicacion(){
        
    }
     public void setproductor(String productor){
        this.productor=productor;
         }
     public void getproductor(){
         
     }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void getGenero(){
        
    }
     
    public void agregarPista(String pista){
        pistas.add(pista);
        System.out.println("Pista ha sido agregado exitosamente!");
    }
   
}
