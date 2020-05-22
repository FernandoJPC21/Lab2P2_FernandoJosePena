
package Semana4;


public class EmpleadoPorComision extends Object {
    private String primernombre;
    private String apellidopaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    
    
    
    
    
    public EmpleadoPorComision(String primernombre, String apellidopaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision){
         this.primernombre = primernombre;
         this.apellidopaterno=apellidopaterno;
         this.numeroSeguroSocial=numeroSeguroSocial;
         this.ventasBrutas=ventasBrutas;
         this.tarifaComision=tarifaComision;
        
          }
    
    public String getPrimerNombre(){
        return primernombre;
        
    }
    public void setPrimerNombre(String primernombre){
        
    }
   
    public String getApellidoPaterno(){
        return apellidopaterno;
    }
    public void setApellidoPaterno(String apellidopaterno){
        
    }
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    public void setNumeroSeguroSocial(String numeroSeguroSocial){
        
    }
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    public void setVentasBrutas(double ventasBrutas){
       if(ventasBrutas<0.0){
           throw new IllegalArgumentException("Las ventas brutas deben ser mayor a 0.");
       } 
    }
    public double getTarifaComision(){
        return tarifaComision;
    }
    public void setTarifaComision(double tarifaComision){
      if(tarifaComision<=0.0 || tarifaComision>=1.0){
          throw new IllegalArgumentException("La tarifa de comision debe ser mayor a 0 y menor a 1.");
      }  
    }
   
    
    public double ingresos(){
        return tarifaComision*ventasBrutas;
    }
    
    @Override
    public String toString(){
        return("Empleado por comision:"+primernombre+""+apellidopaterno+"\nNumero seguro social:"+numeroSeguroSocial+"\nVentas Brutas:"+ventasBrutas+"\nTarifa de comision:"+tarifaComision);
    }
}
