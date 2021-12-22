/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ej1.servicios;

/**
 *
 * @author Usuario
 */
public class PersonaException extends Exception {

    /**
     * Creates a new instance of <code>PersonaException</code> without detail
     * message.
     */
    public PersonaException() {
    }

    /**
     * Constructs an instance of <code>PersonaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PersonaException(String msg) {
        super(msg);
    }
}
