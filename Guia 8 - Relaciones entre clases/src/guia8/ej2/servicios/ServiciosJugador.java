package guia8.ej2.servicios;

import guia8.ej2.entidades.Revolver;
import guia8.ej2.entidades.Jugador;

public class ServiciosJugador {

    ServiciosRevolver gunService = new ServiciosRevolver();

    public void disparo(Revolver gun, Jugador jugador) {
        gunService.shoot(gun, jugador);

    }

    public Revolver reload(Revolver gun) {

        gunService.recargarGun(gun, gun.getTotal()); ///recarga la pistola y ya está preparada para el sgte disparo.
        return gun;
    }
   
    
    
    
}
