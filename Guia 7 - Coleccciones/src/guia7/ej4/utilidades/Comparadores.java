package guia7.ej4.utilidades;

import guia7.ej4.entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarPorNombreDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
/// PARA ordenar AScendente se debe poner primero el o1 y luego el o2.
            return o2.getTitulo().compareTo(o1.getTitulo());
            // Para ordenar Descendente se debe poner primero el o1 y luego el o2.
        }
    };

    public static Comparator<Pelicula> ordenarPorNombreAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorHorasdAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            /// PARA ordenar AScendente se debe poner primero el o1 y luego el o2.
            return o1.getHoras().compareTo(o2.getHoras());
            // Para ordenar Descendente se debe poner primero el o1 y luego el o2.

        }
    };

    public static Comparator<Pelicula> ordenarPorHorasDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {

            return o2.getHoras().compareTo(o1.getHoras());
        }

    };

}
