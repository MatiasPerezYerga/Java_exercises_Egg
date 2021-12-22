
package pooegg.eej6.entidades;

public class Ahorcado {

private String[] palabra;
private int cantidadLetras;
private int intentos;
private boolean[] palabraBooleana;

    public Ahorcado(String[] palabra, int cantidadLetras, int intentos, boolean[] palabraBooleana) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.intentos = intentos;
        this.palabraBooleana = palabraBooleana;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setPalabraBooleana(boolean[] palabraBooleana) {
        this.palabraBooleana = palabraBooleana;
    }

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public int getIntentos() {
        return intentos;
    }

    public boolean[] getPalabraBooleana() {
        return palabraBooleana;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidadLetras=" + cantidadLetras + ", intentos=" + intentos + ", palabraBooleana=" + palabraBooleana + '}';
    }

}
