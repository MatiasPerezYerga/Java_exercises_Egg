package guia7.ej5.Main;

import guia7.ej5.entidades.Pais;
import guia7.ej5.servicios.PaisServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PaisServicio planetService = new PaisServicio();
        Pais p= new Pais(); // tengo que crear un pais ya que el bucle necesita algo inicializado  en el case 2
        String nombreQuitar="";// tambien tengo que crear un nombreQuitar por default ya que lo requiere el bucle.
        
        int resp = 0;
        do {
            System.out.println("Bienvenido");
            System.out.println("Ingrese el numero de la opción que desea:");
            System.out.println("1.Crear Pais");
            System.out.println("2.Agregar al mapamundi");
            System.out.println("3.Mostrar el mapamundi");
            System.out.println("4.Ordenar alfabeticamente el mapamundi");
            System.out.println("5.Ordenar inverso-alf");
            System.out.println("6.Eliminar Pais del mapamundi");
            System.out.println("7.Salir");
            resp = leer.nextInt();

            switch (resp) {

                case 1:
                     p = planetService.crearPais();
                    break;

                case 2:
                    System.out.println("__________________________________________________");
                    planetService.agregarPais(p);
                    System.out.println("Se ha agregado "+p.getNombre()+" al mapamundi");
                    break;
                case 3:
                    System.out.println("__________________________________________________");
                    planetService.mostrarMapamundi();
                    ;
                    break;
                case 4:
                    System.out.println("__________________________________________________");
                    planetService.ordenarMapamundiAlfaDes();
                    break;
                case 5:
                    System.out.println("__________________________________________________");
                    planetService.ordenarMapamundiAlfaAsc();
                    break;
                case 6:
                    System.out.println("__________________________________________________");
                    System.out.println("Ingrese el nombre del País a eliminar");
                    nombreQuitar=leer.next();
                    planetService.eliminarPaisDelMapamundi(nombreQuitar);
                    ;
                    break;
                case 7:
                    System.out.println("__________________________________________________");;
                    break;

            }

        } while (resp != 7);

    }

}
