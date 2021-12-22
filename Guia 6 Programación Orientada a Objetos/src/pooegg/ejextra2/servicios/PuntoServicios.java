package pooegg.eej2.servicios;

import pooegg.eej2.entidades.Puntos;
import java.util.Scanner;

public class PuntoServicios {

    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x1 del Punto 1");
        int x1 = leer.nextInt();
        System.out.println("Ingrese la coordenada y1 del Punto 1");
        int y1 = leer.nextInt();
        
        System.out.println("Ingrese la coordenada x2 del Punto 1");
        int x2 = leer.nextInt();
        System.out.println("Ingrese la coordenada y2 del Punto 1");
        int y2 = leer.nextInt();
        
        Puntos puntos= new Puntos(x1,y1,x2,y2);
        return puntos;
        
        
    }

    public void calcularDistancia(Puntos puntos){
    double base= Math.pow((puntos.getY2()-puntos.getY1()),2)+Math.pow(puntos.getX2()-puntos.getX1(), 2);
    double distancia= Math.sqrt(base);
        System.out.println("La distancia entre dos puntos es: "+distancia);
    }
    
}
