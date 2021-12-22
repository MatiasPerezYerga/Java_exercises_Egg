
package guia8.ej2.entidades;


public class Bala {

private int index;
private boolean usada;

    public Bala() {
    }

    public Bala(int index, boolean usada) {
        this.index = index;
        this.usada = usada;
    }

    public int getIndex() {
        return index;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }

    @Override
    public String toString() {
        return "Bala{" + "index=" + index + ", usada=" + usada + '}';
    }
    



}
