                                        package pooegg.ej12.servicio;

import pooegg.ej12.entidades.Persona;
import java.util.Scanner;
import java.util.Date;


public class ServicioPersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre completo de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        Persona persona = new Persona(nombre, fechaNacimiento);
        return persona;
    }

    public int calcularEdad(Persona persona) {

        Date fechaActual = new Date();

        int anioPers = persona.getNacimiento().getYear();
        int anioActual = fechaActual.getYear();

        int diaActual = fechaActual.getDate();
        int diaPers = persona.getNacimiento().getDate();
        int deltaD = diaActual - diaPers;

        int mesActual = fechaActual.getMonth();
        int mesPers = persona.getNacimiento().getMonth();

        int deltaM = mesActual - mesPers;
        int edad;
        if (deltaM <= 0 && deltaD < 0) {
            edad = anioActual - anioPers - 1;

        } else {
            edad = anioActual - anioPers;
        }

        System.out.println("La edad de " + persona.getNombre() + " es " + edad);
        return edad;
    }

    public boolean menorQue(int edadp1, int edad) {
        boolean menorQue = false;
        if (edadp1>edad) {
            menorQue=true;
        }

        System.out.println(menorQue);
        return menorQue;
    }

    
    
}
