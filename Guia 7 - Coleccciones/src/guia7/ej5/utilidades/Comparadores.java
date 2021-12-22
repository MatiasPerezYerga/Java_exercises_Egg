
package guia7.ej5.utilidades;
import guia7.ej5.entidades.Pais;
import java.util.Comparator;

public class Comparadores {

 public static Comparator<Pais> ordenarPorNombreDesc = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
/// PARA ordenar AScendente se debe poner primero el o1 y luego el o2.
            return o2.getNombre().compareTo(o1.getNombre());
            // Para ordenar Descendente se debe poner primero el o1 y luego el o2.
        }
    };

    public static Comparator<Pais> ordenarPorNombreAsc = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

}
