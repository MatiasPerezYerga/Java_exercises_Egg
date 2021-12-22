package guia7.ej6.servicios;

import guia7.ej1.entidades.Perro;
import java.util.Scanner;
import guia7.ej6.entidades.Producto;
import guia7.ej6.utilidades.Comparadores;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class ProductoServicios {

    Scanner leer = new Scanner(System.in);
    HashMap<Integer, Producto> ecomerce = new HashMap();
    boolean encontrado = false;

    public Producto crearProducto() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre");
        String nombre = leer.next();
        System.out.println("Precio ($):");
        Long precio = leer.nextLong();
        System.out.println("Categoria");
        String categoria = leer.next();

        return new Producto(nombre, precio, categoria);
    }

    public void addProdEcomerce(Producto producto) {

        int size = ecomerce.size();
        ecomerce.put(size + 1, producto);

    }

    public void ordenarPorCategoria() {
        ArrayList<Producto> tiendaArray = new ArrayList();

        for (Map.Entry<Integer, Producto> entry : ecomerce.entrySet()) {

            Producto value = entry.getValue();
            tiendaArray.add(value);
        }

        Collections.sort(tiendaArray, Comparadores.ordenarCategoriaAsc);
        System.out.println(tiendaArray);
    }

    public void ordenarPorNombre() {
        ArrayList<Producto> tiendaArray = new ArrayList();

        for (Map.Entry<Integer, Producto> entry : ecomerce.entrySet()) {

            Producto value = entry.getValue();
            tiendaArray.add(value);
        }

        Collections.sort(tiendaArray, Comparadores.ordenarNombreAsc);
        System.out.println(tiendaArray);

    }

    public void ordenarPorPrecio() {
        ArrayList<Producto> tiendaArray = new ArrayList();

        for (Map.Entry<Integer, Producto> entry : ecomerce.entrySet()) {

            Producto value = entry.getValue();
            tiendaArray.add(value);
        }

        Collections.sort(tiendaArray, Comparadores.ordenarPrecioAsc);
        System.out.println(tiendaArray);
    }

    public void deleteProdEcomerce(String nombreQuitar) {
        ArrayList<Producto> tiendaArray = new ArrayList();
        String nombre = "";
        Producto value = new Producto();
        Integer key = 0;

        for (Map.Entry<Integer, Producto> aux : ecomerce.entrySet()) {
            key = aux.getKey();
            value = aux.getValue();
            tiendaArray.add(value);

        }

        for (Producto prod : tiendaArray) {
            if (nombreQuitar.equals(prod.getNombre())) {
               
                System.out.println(encontrado);
                
                nombre = prod.getNombre();
                ecomerce.remove(key, value);
                encontrado = true;
            }

        }

        if (encontrado) {
            System.out.println("Se ha eliminado con éxito a " + nombreQuitar);
        } else {
            System.out.println("No hemos encontrado a " + nombreQuitar);
        }
    }

    public void mostrarEcomerce() {
        System.out.println(ecomerce);

    }

}
