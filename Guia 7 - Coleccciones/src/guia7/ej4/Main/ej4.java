package guia7.ej4.Main;

import guia7.ej4.entidades.Pelicula;
import guia7.ej4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        ArrayList<Pelicula> bibliotecaDePeliculas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\\n");

        int resp = 0;

        String titulo1 = "Gran Torino";
            String director1 = "DirectorsCUt";
            float horas1 = 3;
            Pelicula granTorino = new Pelicula(titulo1, director1, horas1);
            bibliotecaDePeliculas.add(granTorino);

            String titulo2 = "Detras de los miedos";
            String director2 = "Romeo";
            float horas2 = 2;
            Pelicula behindFears = new Pelicula(titulo2, director2, horas2);
            bibliotecaDePeliculas.add(behindFears);

            String titulo3 = "Detras de los miedos";
            String director3 = "Romeo";
            float horas3 = 4;
            Pelicula behindFears2 = new Pelicula(titulo3, director3, horas3);
            bibliotecaDePeliculas.add(behindFears2);

        do {
            System.out.println("1.Desea cargar un pelicula?");
            System.out.println("2.Mostrar todas las peliculas");
            System.out.println("3.Mostrar todas las peliculas con duracion mayor a 1 hora");
            System.out.println("4.Ordenar las peliculas por Duracion en orden Descendente");
            System.out.println("5.Ordenar las peliculas por Duracion en orden Ascendente");
            System.out.println("6.Ordenar las peliculas alfabeticamente por orden Descendente");
            System.out.println("7.Ordenar las peliculas alfabeticamente por orden Ascendente");
            System.out.println("8. Salir");

            
            resp = leer.nextInt();
            switch (resp) {
                case 1:

                    System.out.println("Ingrese el titulo");
                    String titulo = leer.next();
                    System.out.println("Ingrese el director");
                    String director = leer.next();
                    System.out.println("Ingrese la duración en horas");
                    Float duracion = leer.nextFloat();

                    Pelicula peli = new Pelicula(titulo, director, duracion);
                    bibliotecaDePeliculas.add(peli);
                    break;
                case 2:
                    System.out.println(bibliotecaDePeliculas);
                    break;
                case 3:
                    for (Pelicula aux : bibliotecaDePeliculas) {
                        if (aux.getHoras() >= 1) {
                            System.out.println(aux);
                        }
                    }

                    break;
                case 4:
                    ordenarBibliotecaPorHorasDesc(bibliotecaDePeliculas);
                    break;

                case 5:
                    ordenarBibliotecaPorHorasAsc(bibliotecaDePeliculas);
                    break;

                case 6:
                    ordenarBibliotePorTituloDes(bibliotecaDePeliculas);
                    break;

                case 7:
                    ordenarBibliotePorTituloAsc(bibliotecaDePeliculas);
                    break;

            }
        } while (resp
                != 8);

    }

    public static void ordenarBibliotecaPorHorasAsc(ArrayList bibliotecaDePeliculas) {
        Collections.sort(bibliotecaDePeliculas, Comparadores.ordenarPorHorasdAsc);
        for (Object bibliotecaDePelicula : bibliotecaDePeliculas) {
            System.out.println(bibliotecaDePelicula);

        }

    }

    public static void ordenarBibliotecaPorHorasDesc(ArrayList bibliotecaDePeliculas) {
        Collections.sort(bibliotecaDePeliculas, Comparadores.ordenarPorHorasDesc);
        for (Object bibliotecaDePelicula : bibliotecaDePeliculas) {
            System.out.println(bibliotecaDePelicula);

        }

    }

    public static void ordenarBibliotePorTituloDes(ArrayList bibliotecaDePeliculas) {
        Collections.sort(bibliotecaDePeliculas, Comparadores.ordenarPorNombreDesc);
        for (Object bibliotecaDePelicula : bibliotecaDePeliculas) {
            System.out.println(bibliotecaDePelicula);

        }

    }

    public static void ordenarBibliotePorTituloAsc(ArrayList bibliotecaDePeliculas) {
        Collections.sort(bibliotecaDePeliculas, Comparadores.ordenarPorNombreAsc);
        for (Object bibliotecaDePelicula : bibliotecaDePeliculas) {
            System.out.println(bibliotecaDePelicula);

        }

    }

}
