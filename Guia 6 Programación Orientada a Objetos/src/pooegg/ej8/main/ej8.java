
package pooegg.ej8.main;
import java.util.Scanner;
import pooegg.ej8.entidades.Cadena;
import pooegg.ej8.servicios.ServicioCadena;


public class ej8 {


    public static void main(String[] args) {
       // Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        ServicioCadena servicioCadena=new ServicioCadena();
       Cadena c1=servicioCadena.crearCadena();/// EN ESTA LINEA CREE LA CADENA Y ES DEVUELTA COMO OBJETO., ENTONCES PARA RECIBIRLA EN EL MAIN TENGO QUE DEFINIRLA CON UN NOMBRE.
        System.out.println(c1); 
      servicioCadena.contarVocales(c1);
      servicioCadena.escribirInvertido(c1);
        System.out.println("");
      servicioCadena.vecesRepetido(c1);
      servicioCadena.compararLongitud(c1);
      servicioCadena.unirFrases(c1);
      servicioCadena.remplazar(c1);
      boolean r1=servicioCadena.contiene(c1); // EN ESTA LINEA SE DEVUELVE UN BOOLEAN Y POR LO TANTO DEBO CREARLO EN EL MAIN Y DEFINIRLO CON UN NOMBRE
        System.out.println(r1);
    }
    
}
