package guia7.ej5.servicios;

import java.util.Scanner;
import guia7.ej5.entidades.Pais;
import java.util.Collections;
import java.util.HashSet;
import guia7.ej5.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Iterator;

public class PaisServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\\n");//.useDelimiter(*/n*);
    private HashSet<Pais> mapamundi = new HashSet();
    

    public Pais crearPais() {

        System.out.println("Ingrese el nombre del país");
        String nombre = leer.next();
        return new Pais(nombre);
    }

    public void agregarPais(Pais pais) {
                mapamundi.add(pais);
    }

    public void ordenarMapamundiAlfaDes() {
        ArrayList<Pais> mapamundiArrayList = new ArrayList();

        for (Pais pais : mapamundi) {
            mapamundiArrayList.add(pais);
        }

        Collections.sort(mapamundiArrayList, Comparadores.ordenarPorNombreAsc);

        for (Pais pais : mapamundiArrayList) {
            System.out.println(pais);
        }

    }

    public void ordenarMapamundiAlfaAsc() {
        ArrayList<Pais> mapamundiArrayList = new ArrayList();

        for (Pais pais : mapamundi) {
            mapamundiArrayList.add(pais);
        }

        Collections.sort(mapamundiArrayList, Comparadores.ordenarPorNombreDesc);

        for (Pais pais : mapamundiArrayList) {
            System.out.println(pais);
        }
    }

    public void eliminarPaisDelMapamundi(String nombreQuitar) {
        Iterator<Pais> it = mapamundi.iterator();
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getNombre().equals(nombreQuitar)) {
                mapamundi.remove(aux);
                System.out.println("El País ha sido borrado del mapa.");
            }else{
                System.out.println("El Pais no se registra en el mapamundi.");
            }
        }

    }

    public void mostrarMapamundi(){
        System.out.println(mapamundi);
    
    }
    
    
}
