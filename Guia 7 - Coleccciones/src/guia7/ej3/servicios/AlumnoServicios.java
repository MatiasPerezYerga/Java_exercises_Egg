package guia7.ej3.servicios;

import guia7.ej3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> clase = new ArrayList();

    public Alumno crearAlumno() {

        System.out.println("Ingrese el nombre del Alumno");
        String nombre = leer.next();
        System.out.println("Ingrese la primera nota");
        Integer n1 = leer.nextInt();
        System.out.println("Ingrese la 2da nota");
        Integer n2 = leer.nextInt();
        System.out.println("Ingrese la 3ra nota");
        Integer n3 = leer.nextInt();

        ArrayList<Integer> notas = new ArrayList();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);

        Alumno alumno = new Alumno(nombre, notas);
        clase.add(alumno);
        System.out.println(clase);
        return alumno;
    }

    public void calcularNotaFinal( String nombre) {
        Integer n1 = 0;
        boolean logic = false;
        Iterator<Alumno> it = clase.iterator();
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNombre().equals(nombre)) {
                logic = true;
                
                for (int i = 0; i < next.getNotas().size(); i++) {
                    System.out.println(next.getNotas().get(i));
                    n1 = next.getNotas().get(i) + n1;
//indexOf(i)+n1;

                }
//                for (Integer aux : next.getNotas()) {
//                    total = total + aux;
//                }
            }
        }
        if (logic == false) {
            System.out.println("El alumno no se encuentra ");
        } else {
            System.out.println("La nota final del alumno es" + n1 / 3);

        }

    }
}
