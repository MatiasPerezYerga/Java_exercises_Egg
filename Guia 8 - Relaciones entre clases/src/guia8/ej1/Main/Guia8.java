
package guia8.ej1.Main;
import guia8.ej1.entidades.Perro;
import guia8.ej1.entidades.Persona;
import java.util.Scanner;

public class Guia8 {

  public static void main(String[] args) {

   Perro rope1 = new Perro("Chiquito","beagle",12,"Grande");
   Perro rope2 = new Perro("Titan","caniche",4,"Pequeño");
   Persona p1 = new Persona("Matias", "Perez",31,34917579,rope1 );
   Persona p2= new Persona("Juan", "soler",18,12265489,rope2);
        
      System.out.println(p1);
      System.out.println(p2);
        
        
    }
    
}
