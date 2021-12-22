package guia8.ej2.entidades;

import java.util.ArrayList;
import java.util.List;
import guia8.ej2.entidades.Bala;

public class Revolver {

    private int posicionActual;  //Posición disparo
    private int posicionAgua;     // Posicion donde se encuentra el agua.
    private int total;
    private ArrayList<Bala> tambor;

    public Revolver(int posicionActual, int posicionAgua, int total, ArrayList<Bala> tambor) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
        this.total = total;
        this.tambor = tambor;
    }

    public Revolver() {
        this.tambor = new ArrayList();

    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<Bala> getTambor() {
        return tambor;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTambor(ArrayList<Bala> tambor) {
        this.tambor = tambor;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + ", total=" + total + ", tambor=" + tambor + '}';
    }

}
