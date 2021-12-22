
package pooegg.ej9.main;

import pooegg.ej9.entidades.Matematica;
import pooegg.ej9.servicios.ServicioMatematica;


public class ej9 {

    public static void main(String[] args) {

        Matematica mat= new Matematica();
        double n1=Math.random();
        double n2=Math.random();
        mat.setNumero1(n1);
        mat.setNumero2(n2);
        System.out.println(mat);
        
        ServicioMatematica servMat=new ServicioMatematica();
        servMat.devolverMayor(mat);
        servMat.calcularPotencia(mat);
        servMat.calcularRaiz(mat);
    }
    
}
