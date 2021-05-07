
package Trabajos2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Usuario x =new Usuario();
        System.out.println("***DIUNSA***");
        System.out.println("\n\t M E N U  D E  I N I C I O ");
        System.out.println("\t___________\n");
        int opcion;
        do{
        System.out.println("1. Login");
        System.out.println("2. Crear Usuario");
        System.out.println("3. Salir");
        
        System.out.println("Ingrese Opcion: ");
        
         opcion=input.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("\t** L O G I N **\n");
        
         x.peticionLogin();
         x.Login();
         break;
          case 2:
                System.out.println("\t** C R E A R  U S U A R I O**");
                x.peticionCreacion();
                x.CreacionPlayer();
               break;
        }
        }while(opcion!=3);
    }
}
