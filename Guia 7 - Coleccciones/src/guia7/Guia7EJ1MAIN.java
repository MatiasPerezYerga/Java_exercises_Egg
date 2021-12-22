package guia7;

import java.util.Scanner;
import guia7.ej1.entidades.Perro;
import guia7.ej1.servicios.PerroServicios;

public class Guia7EJ1MAIN {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        PerroServicios PetServices = new PerroServicios();

        int resp = 0;

        do {
            System.out.println("Eliga la opcion introduciendo el numero:");
            System.out.println("1.Agregar otro perro?");
            System.out.println("2.Quitar perro");
            System.out.println("3.Salir");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    Perro m = PetServices.crearPerro();
                    PetServices.agregarPerrera(m);
                    break;

                case 2:

                    System.out.println("Ingrese el nombre del perro que desea quitar");
                    String name = leer.next();
                    //PetServices.eliminarPerroPorNombre2(name);
                     PetServices.eliminarPerroPorNombre(name);
                    break;

                case 3:
                    break;
            }
            
        } while (resp != 3);

    }

}
