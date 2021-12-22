
package pooegg.ej12.main;
import java.util.Scanner;
import pooegg.ej12.servicio.ServicioPersona;
import pooegg.ej12.entidades.Persona;

public class ej12 {


    public static void main(String[] args) {
        
    ServicioPersona serviceP=new ServicioPersona();
    Scanner leer= new Scanner(System.in);

    Persona  p1=serviceP.crearPersona();
        System.out.println(p1);
        int edadp1=serviceP.calcularEdad(p1);
        
        System.out.println("Ingrese una edad para verificar si es menor que la persona ingresada");
        int edad=leer.nextInt();
    serviceP.menorQue(edadp1, edad);
    }
    
}
