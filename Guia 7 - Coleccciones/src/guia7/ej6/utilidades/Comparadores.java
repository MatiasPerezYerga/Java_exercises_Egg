
package guia7.ej6.utilidades;

import guia7.ej6.entidades.Producto;
import java.util.Comparator;


public class Comparadores {

public static Comparator<Producto> ordenarNombreAsc = new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
/// PARA ordenar AScendente se debe poner primero el o1 y luego el o2.
            return o1.getNombre().compareTo(o2.getNombre());
            // Para ordenar Descendente se debe poner primero el o1 y luego el o2.
        }
    };

    public static Comparator<Producto> ordenarPrecioAsc = new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            return o1.getPrecio().compareTo(o2.getPrecio());
        }
    };

    public static Comparator<Producto> ordenarCategoriaAsc = new Comparator<Producto>() {
        @Override
        public int compare(Producto o1, Producto o2) {
            return o1.getCategoria().compareTo(o2.getCategoria());
        }
    };
    
}
