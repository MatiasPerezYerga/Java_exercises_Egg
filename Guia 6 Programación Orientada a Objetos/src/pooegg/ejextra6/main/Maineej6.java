package pooegg.eej6.main;
import java.util.Scanner;
import pooegg.eej6.entidades.Ahorcado;
import pooegg.eej6.servicios.AhorcadoServicios;



public class Maineej6 {

    public static void main(String[] args) {

        AhorcadoServicios ahorcadoServicios=new AhorcadoServicios();
        
        Ahorcado c1= ahorcadoServicios.crearJuego();
        ahorcadoServicios.buscarLetra(c1);
        
        
    }

}
