/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooegg.ej1.entidades;

import java.util.Scanner;


///ATRIBUTOS
public class Libro{
private int isbn;
private String titulo;
private String autor;
private int nropaginas;

///CONSTRUCTORES PASADOS POR PARAMETROS

    public Libro(int isbn, String titulo, String autor, int nropaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropaginas = nropaginas;
    }
/// CONSTRUCTOR POR DEFECTO
    
    public Libro(){
    this.isbn=0;
    this.titulo= "Libro por defecto";
    this.autor="Autor por defecto";
    this.nropaginas= 100;
         
    }
/// METODOS DE ENCAPSULAMIENTO GETTER AND SETTER: DA ACCESO SOLO A TRAVÉS DE LOS METIDOS PERTINENTES
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNropaginas(int nropaginas) {
        this.nropaginas = nropaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNropaginas() {
        return nropaginas;
    }

    @Override  //Libro{isbn=1563, titulo=MAS ALLA DE LA VIDA, autor=Pepito Argento, nropaginas=100 .    EL TO STRING DEVUELVE LO SIGUIENTE:
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nropaginas=" + nropaginas + '}';
    }

public void consultanrollamiento_exe(){    
    Libro libro1 = new Libro();
        String answer = "";
        int d1 = 0;
        int isbn = 0;
        String autor = "";
        String titulo = "";
        int nroPaginas = 0;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("Ingrese el numero y la opcion que desea:");
            System.out.println("1.Acceeder a los datos por default");
            System.out.println("2.Ingresar un nuevo libro");
            d1 = leer.nextInt();

            //  while (d1 != 1 || d1 != 2) {
            //    System.out.println("Ingrese el numero y la opcion que desea:");
            //  System.out.println("1.Acceeder a los datos por default");
            //System.out.println("2.Ingresar un nuevo libro");
            // d1 = leer.nextInt();
            // }
            switch (d1) {
                case 1:
                    System.out.println(libro1.getIsbn());
                    System.out.println(libro1.getAutor());
                    System.out.println(libro1.getTitulo());
                    System.out.println(libro1.getNropaginas());
                    break;
                case 2:
                    System.out.println("Ingrese el isbn");
                    isbn = leer.nextInt();
                    libro1.setIsbn(isbn);
                    System.out.println("Ingrese el Autor");
                    autor = leer.next();
                    libro1.setAutor(autor);
                    System.out.println("Ingrese el Titulo");
                    titulo = leer.next();
                    libro1.setTitulo(titulo);
                    System.out.println("Ingrese el nroPaginas");
                    nroPaginas = leer.nextInt();
                    libro1.getNropaginas();

        //            System.out.println(libro1.getIsbn());
        //            System.out.println(libro1.getAutor());
        //            System.out.println(libro1.getTitulo());
        //           System.out.println(libro1.getNropaginas());
                    
                    System.out.println(libro1.toString());  //O SE PUEDE IMPRIMIR DE UNA CON EL toString
                    
                    break;
            }
            System.out.println("Desea volver al menu principal?");
            System.out.println("1. Si");
            System.out.println("2. No");
            answer = leer.next();
        } while (answer.equals("1"));
}
}