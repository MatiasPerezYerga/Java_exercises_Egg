package guia9.ej2;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean tdt;

    public Televisor(int resolucion, boolean tdt, Double precio, String color, char consumoEnergetico, Double peso) {

        super(precio, color, consumoEnergetico, peso);

        this.resolucion = resolucion;

        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {

        crearElectrodomestico();
        System.out.println("Que resolucion tiene el televisor?");
        resolucion = 50;
        System.out.println("Tiene sintetizador TDT incorporado?");
        tdt = true;
               
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio = precio * 1.3;
        }
        if (tdt) {
            precio = precio + 500;
        }
        System.out.println("El precio final del televisor es " + precio);
    }

    @Override
    public String toString() {
        return "Televisor {" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", resolucion=" + resolucion+ ", tdt=" + tdt + '}';
    }

   

}
