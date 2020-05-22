
package Semana4;


public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double SalarioBase;
    
   public EmpleadoBaseMasComision(){
        super();
        this.SalarioBase=0;
    }
    
    public EmpleadoBaseMasComision(String primernombre, String apellidopaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision){
        super(primernombre, apellidopaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        setSalarioBase(SalarioBase);
    }

   

    private void setSalarioBase(double salariobase) {
     if(SalarioBase<0.0){
         throw new IllegalArgumentException("El salario base debe ser arriba de 0.");
     }  
     
    }

     @Override
     public double ingresos(){
    return SalarioBase+super.ingresos();
}
    
  @Override
  public String toString(){
      return "Empleado por comision con sueldo base:"+super.getPrimerNombre()+"\nNumero de seguro social:"+super.getNumeroSeguroSocial()+"\nVentas brutas:"+super.getVentasBrutas()+
              "\nTarifa de comision:"+super.getTarifaComision()+"\nSalario base:"+SalarioBase;
  }
}
