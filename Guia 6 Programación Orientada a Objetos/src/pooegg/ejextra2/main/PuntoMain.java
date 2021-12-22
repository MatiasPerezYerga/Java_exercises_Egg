package pooegg.eej2.main;
import pooegg.eej2.entidades.Puntos;
import pooegg.eej2.servicios.PuntoServicios;

public class PuntoMain {


    public static void main(String[] args) {

        PuntoServicios puntoServicio= new PuntoServicios();
        Puntos par1=puntoServicio.crearPuntos();
        puntoServicio.calcularDistancia(par1);
        
    }
    
}
