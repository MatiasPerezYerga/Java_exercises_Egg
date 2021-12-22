package pooegg.ej11.mainDate;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;
import java.util.Date;

public class MainDate {
public static final Scanner leer = new Scanner(System.in);
public static  int n1=2;
    public static void main(String[] args) {
        int respuesta = 2;
        int dia, mes, anio;

        Date fechaActual = new Date();

        int cajitaFecha[] = new int[3];

        do {
            System.out.println("Ingrese la fecha que desea calcular la diferencia dia ,mes y anio ordenadamente utilizando dd/mm/aaaa");
            for (int i = 0; i < 3; i++) {
                cajitaFecha[i] = leer.nextInt();
            }
            dia = cajitaFecha[0];
            mes = cajitaFecha[1];
            anio = cajitaFecha[2];
            Date fecha = new Date(anio - 1900, mes - 1, dia);
            int deltaa = fecha.getYear() - fechaActual.getYear();
            int deltam = fecha.getMonth() - fechaActual.getMonth();
            int deltaDate = fecha.getDay() - fechaActual.getDay();
            System.out.println("1." + deltaa);  //1.
            System.out.println("2." + dia + "/" + mes + "/" + cajitaFecha[2]); //2.
            System.out.println("3." + fecha);//3.

            System.out.println("");
            System.out.println("4." + "Fecha Actual" + fechaActual);//4.
            System.out.println("5." + "delta meses" + deltam);//5.

//            System.out.println("*****delta dias****** " + deltad);//6.
            System.out.println("6." + fecha.getDate());//7.

            int delta = fecha.compareTo(fechaActual);
            System.out.println("COMPAREto" + delta);

            if (fecha.compareTo(fechaActual) > 0) {
                System.out.println("despues");
            } else if (fecha.compareTo(fechaActual) < -0) {
                System.out.println("ANTES");
            } else if (fecha.compareTo(fechaActual) == 0) {
                System.out.println("PRESENTE");
            }


            LocalDate myDate = LocalDate.parse(fecha.toString());

            LocalDate fechaActualLocal = LocalDate.now();

            long numberOFDays = DAYS.between(myDate, fechaActualLocal);

            System.out.println(numberOFDays);
            
            int deltaSeg = fecha.getSeconds() - fechaActual.getSeconds();
            System.out.println("deltaSeg " + deltaSeg);//8.
            System.out.println("Reiniciar?");
            System.out.println("1.SI");//8.
            System.out.println("1.NO");//8.
            respuesta = leer.nextInt();
        } while (respuesta == 1);

    }

}
