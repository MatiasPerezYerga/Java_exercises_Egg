package guia8.ej2.servicios;

import guia8.ej2.entidades.Bala;
import java.util.Scanner;
import guia8.ej2.entidades.Revolver;
import guia8.ej2.entidades.Jugador;
import java.util.ArrayList;

public class ServiciosRevolver {

    public Revolver recargarGun(Revolver gun, int balas) {

        gun.setPosicionActual((int) (Math.random() * balas + 1)); /// REALIZA REALOADING RANDOM SEGUN LA CANTIDAD DE BALAS QUE POSEA EL TAMBOR DEL ARMA.
        gun.setPosicionAgua((int) (Math.random() * balas + 1));
        gun.setTotal(balas);

        for (int i = 1; i <= balas; i++) {
            Bala bala = new Bala(i, false);
            gun.getTambor().add(bala);

        }
        System.out.println(gun);
        return gun;
    }

    public Revolver shoot(Revolver gun, Jugador jugador) {
        System.out.println(gun);
        
        for (Bala bala : gun.getTambor()) {   //recorremos el tambor para cruzar la bala con la posicion actual
            if (bala.getIndex() == gun.getPosicionActual()) { //cuando la encontramos DISPARAMOS

                if (gun.getPosicionActual() == gun.getPosicionAgua()) {   //Si la posicion actual de la bala coincidia con la del agua

                    jugador.setMojado(true);  // moja al jugador

                    bala.setUsada(true);  // descarta la bala marcandola como usada
                    System.out.println("SPLASHHH MOTHER FOCA");
                    
                    System.out.println(jugador);
                    
                } else {
                    System.out.println("OOOOOSO!!!!");
                    bala.setUsada(true); // descarta la bala marcandola como usada
                    System.out.println(jugador);
                }

            }

        }

        return gun;
    }

    public Revolver siguienteBala(Revolver gun) {

        int a = gun.getPosicionActual();
        System.out.println(a);
        
        
        if(a==gun.getTambor().size()){
        gun.setPosicionActual(1);
        }else{gun.setPosicionActual(a+1);}
        System.out.println(a);
        return gun;
    }

    public void mostrarGun(Revolver gun) {

        System.out.println(gun);

    }

}
