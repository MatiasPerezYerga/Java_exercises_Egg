/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooegg.ej1.main;
///import pooegg.ej1.Libro;

import pooegg.ej1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro libro1 = new Libro();                   //CON LA POO GENERAS EL MOLDE Y LA PODES INVOCAR A LA CLASE CUANTAS VECES QUIERAS CUANDO QUIERAS INSTANCIAR(CREAR UN OBJETO).
        libro1.consultanrollamiento_exe();              //
        //System.out.println(libro1);   YA ESTA INCLUIDA EN LA CLASE LIBRO
       
    }

}
