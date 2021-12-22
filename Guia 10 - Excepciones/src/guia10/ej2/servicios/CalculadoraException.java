/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ej2.servicios;

/**
 *
 * @author Usuario
 */
public class CalculadoraException extends Exception {

    /**
     * Creates a new instance of <code>CalculadoraException</code> without
     * detail message.
     */
    public CalculadoraException() {
    }

    /**
     * Constructs an instance of <code>CalculadoraException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CalculadoraException(String msg) {
        super(msg);
    }
}
