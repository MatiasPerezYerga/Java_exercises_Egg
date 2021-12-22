package pooegg.ej5.main;

import pooegg.ej5.entidades.Cuenta;
import pooegg.ej5.servcios.CuentaServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cuentaServicio = new CuentaServicio();
        int opcion = 0;
        //  System.out.println("Bienvenido al Banco del futuro");
        //System.out.println("Ingrese la opcion disponible.\n1.Crear cuenta");
        // opcion = leer.nextInt();
        while (opcion != 1) {
            System.out.println("Bienvenido al Banco del futuro");
            System.out.println("Ingrese la opcion disponible.\n1.Crear cuenta");
            opcion = leer.nextInt();
        }
        Cuenta cuenta = cuentaServicio.crearCuenta();  ///no requiere argumento
        System.out.println(cuenta);
        int salir = 2;
        do {
            System.out.println("2.Ingresar dinero\n3.Extraerdinero\n4.Extracción express\n5. Consultar saldo\n6.Consultar Datos\n7.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 2:
                    cuentaServicio.ingresarDinero(cuenta);
                    continue;
                case 3:
                    cuentaServicio.extraerDinero(cuenta);
                    continue;
                case 4:
                    cuentaServicio.extraccionRapida(cuenta);
                    continue;
                case 5:
                    cuentaServicio.consultarSaldo(cuenta);
                    continue;
                case 6:
                    cuentaServicio.consultarDatos(cuenta);
                    continue;
                case 7:
                    System.out.println("desea salir? 1. Si 2.No");
                    salir = leer.nextInt();
            }
        } while (salir == 2 || salir != 1);
    }
}
