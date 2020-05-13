
package Semana1;

import java.util.ArrayList;


public class artista {
 private String nombre;
 private String nombreArtistico;
 private String pais;
 private int edad;
 private ArrayList discografia = new ArrayList();
       
    
    
  public artista(String nombre, String nombreArtistico, String pais, int edad){
     
      
        
    }
    public void getnombre(String nombre){
        this.nombre=nombre;
         }
    public void setnombre(String nombre){
        
    }
    
     public void getnombreArtistico(String nombreArtistico){
        this.nombreArtistico=nombreArtistico;
         }
    public void setnombreArtistico(String nombreArtistco){
        
    }
     public void getpais(String pais){
        this.pais=pais;
         }
    public void setpais(String pais){
        
    }
     public void getedad(int edad){
        this.edad=edad;
         }
    public void setedad(int edad){
        
    }
    public void agregarAlbum(String album){
        discografia.add(album);
        System.out.println("Album ha sido agregado exitosamente!");
    }
}
