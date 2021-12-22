package guia7.ej1.servicios;

import java.util.Scanner;
import guia7.ej1.entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;

public class PerroServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<Perro> perrera = new ArrayList();

    public Perro crearPerro() {

        System.out.println("Ingrese el nombre del Perro");
        String nombre = leer.next();

        System.out.println("Ingrese la raza del Perro");
        String raza = leer.next();

        Perro perro = new Perro(nombre, raza);

        return perro;

    }

    public void agregarPerrera(Perro perro) {
        perrera.add(perro);
        System.out.println(perrera);
    }

    public void eliminarPerroPorNombre(String nombreQuitar) {
        Iterator<Perro> it = perrera.iterator();  /// EL ITERATOR SE DEBE CREAR ACA YAS QUE SI LO CREO AL PRINCIPIO NO HAY ELEMENTOS SELECCIONADOS
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getNombre().equals(nombreQuitar)) {
                it.remove();
            }
                       
        }
        System.out.println(perrera);

    }

    public void eliminarPerroPorNombre2(String nombreQuitar) {

        for (int i = 0; i < perrera.size(); i++) {
            Perro p = perrera.get(i);
            if (p.getNombre().equals(nombreQuitar)) {
                perrera.remove(p);
                // METODO PARA ORDENAR LISTA
            }

        }
        System.out.println(perrera);

    }

//    public void fabricaDePerros(int cantidad) {
//        for (int i = 0; i <= cantidad; i++) {
//         
//            (crearPerro());
//        }
//
//    }
}
