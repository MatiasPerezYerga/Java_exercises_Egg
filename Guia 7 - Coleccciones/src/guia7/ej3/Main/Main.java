package guia7.ej3.Main;

import guia7.ej3.servicios.AlumnoServicios;
import guia7.ej3.entidades.Alumno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AlumnoServicios alumnoService = new AlumnoServicios();
        Scanner leer = new Scanner(System.in);
        String nombreAlumno = "";
        int resp = 0;
        do {
            System.out.println("1.Desea cargar un alumno?");
            System.out.println("2.Calcular nota Final");
            System.out.println("3.Salir");
            resp=leer.nextInt();
            switch (resp) {
                case 1:
                        
                    Alumno al = alumnoService.crearAlumno();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del Alumno que desea conocer su nota final");
                    nombreAlumno = leer.next();
                    alumnoService.calcularNotaFinal(nombreAlumno);
                    break;
                case 3:
                    break;
            }
        } while (resp != 3);

    }

}
