package pooegg.ej5.servcios;

import java.util.Scanner;
import pooegg.ej5.entidades.Cuenta;

public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        /// INGRESAN POR TECLADO LOS DATOS Y SE ALMACENAN EN VARIABLES
        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el dni: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        float saldoActual = leer.nextFloat();

///SE CREA UN NUEVO OBJETO Y SE DEFINEN LOS ATRIBUTOS
        // 
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta(numeroCuenta);
        cuenta.setDni(dni);
        cuenta.setSaldoactual(saldoActual);

        return cuenta;

    }

    public void ingresarDinero(Cuenta cuenta) { /// METODO DEL SERVICIO PARA ACCEDER AL  ATRIBUTO DEL OBJETO, SOLLICITAR CUANTO INGRESAR Y SUMARLO AL ATRIBUTO (settearlo)

        double saldo = cuenta.getSaldoactual();// OBTENGO el saldo actual del objeto ya creado
        System.out.println("Ingrese la cantidad de dinero que desea sumar a su cuenta:");
        double suma = leer.nextDouble();
        double saldoNuevo = saldo + suma;
        cuenta.setSaldoactual(saldoNuevo);

    }

    public void extraerDinero(Cuenta cuenta) { ///METODO DE EXTRACION DE DINERO CON CONDICIONAL DE MONTO
        double saldo = cuenta.getSaldoactual();
        if (saldo == 0 || saldo < 0) {
            System.out.println("No tiene saldo disponible");
        } else {
            System.out.println("Ingrese la cantidad de dinero que desea extraer de la cuenta:");
            double resta = leer.nextDouble();
            double saldoNuevo = saldo - resta;
            cuenta.setSaldoactual(saldoNuevo);
        }
    }

    public void extraccionRapida(Cuenta cuenta) {

        double saldo = cuenta.getSaldoactual();
        if (saldo >= 1000) {
            System.out.println("Se extraeran el % 20 de manera express, de su saldo de $ " + saldo + ".");
            double saldoNuevo = saldo * 0.8;
            cuenta.setSaldoactual(saldoNuevo);
        } else {
            System.out.println("Su saldo es inferior al que permite el retiro express");
        }

    }

    public void consultarSaldo(Cuenta cuenta) {
        double saldo = cuenta.getSaldoactual();
        System.out.println("El saldo disponible es " + saldo);
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println(cuenta.toString());
    }

}
