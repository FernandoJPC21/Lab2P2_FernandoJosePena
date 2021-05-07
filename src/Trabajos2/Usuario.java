package Trabajos2;


import java.util.Scanner;

public class Usuario {
    
 //Atributos
String idUser;
String contrasenaUser;
Scanner leer;
String[][]datos;
String playerLogged;
int contador;
String Usuario2;
String Usuario2Logged;
int salir;
int salirLogin2;
int Loginverificado;
int Creacionverificado;
int Login2verificado;
int eliminar;
int cierre;
int numero;
int verificacion=0;
int opcion=0;
String reporte[][];

public Usuario(){
   
    leer=new Scanner(System.in);
    datos=new String[10][2];
    contador=0;
    salir=0;
    eliminar=0;
    cierre=0;
    numero=0;    
}

public void peticionLogin(){
    System.out.print("Ingrese player= ");
    String nombre=leer.next();
    idUser=nombre;
    System.out.print("Ingrese contraseña= ");
    String contrasena=leer.next();
    contrasenaUser=contrasena;
    
}
public void Login(){
    Loginverificado=0;
    
    for(int fila=0;fila<10;fila++){
        verificacion=0;
            if(idUser.equals(datos[fila][0])&&contrasenaUser.equals(datos[fila][1]))
                verificacion++;
            
            if(verificacion==1){
            System.out.println("\n\tPlayer "+datos[fila][0]+" LOGGED IN\n");
            playerLogged=datos[fila][0];
            break;
        }
    }
    if (verificacion==0){
        System.out.println("\n\t-----Player no existe-----");
        Loginverificado=1;
    }
    
}
public void peticionCreacion(){
    System.out.print("Ingrese player= ");
    String nombre=leer.next();
    idUser=nombre;
    System.out.print("Ingrese contrasena= ");
    String contrasena=leer.next();
    contrasenaUser=contrasena;
    
}
public void CreacionPlayer(){
  if(contador<10){
      Creacionverificado=0;
    int verificacion=0;
    int error=0;
    for(int fila=0;fila<10;fila++){
        if(idUser.equals(datos[fila][0])){
            error++;
            Creacionverificado=1;
        }
    }  
   if(error==0){
    for(int fila=0;fila<10;fila++){
            if(datos[fila][0]==null){
                datos[fila][0]=idUser;
                datos[fila][1]=contrasenaUser;
                
              if(contador==0){   
                playerLogged=datos[fila][0];
              }
                verificacion++;
              if (contador<10){
                contador++;
              }
                System.out.println("\n\t---PLAYER CREADO EXITOSAMENTE---");
                break;
                
             }   
    }
     if(verificacion==0){
                System.out.println("\n\t---CREACION DE PLAYER FALLIDA---");           
       }
   }
   if(error!=0||contador>10){
       System.out.println("\n\t---CREACION DE PLAYER FALLIDA---");
   }
   
}
  else
    System.out.println("\n\t---CREACION DE PLAYER FALLIDA---");
  
}

   public void LoginJuego(){
  
    salir=0;
     
    System.out.println("\n\t--LOGIN PLAYER2--\n\t1.Login Player2\n\t2.Salir");
       System.out.print("\nIngrese opcion= ");
       int login2=leer.nextInt();
    
      switch(login2){
      
          case 1:
         System.out.print("Ingrese player= ");
         String nombre=leer.next();
         Usuario2=nombre;
         Player2Logged();
         break;
         
      case 2:
          salir=1;
      break;   
   }
  }

public void Player2Logged(){
    for(int recorrido=0;recorrido<10;recorrido++){
       
        if (Usuario2.equals(datos[recorrido][0])&& !Usuario2.equals(playerLogged)){
            Usuario2=Usuario2;
            
            salir=1;
            System.out.println("\n\tPlayer 2 ["+Usuario2+"] LOGGED IN");  
            break;
        }
    }
    if( salir==0){
        System.out.println("\n\t--LOGIN FALLIDO--");
    }
    
}
}