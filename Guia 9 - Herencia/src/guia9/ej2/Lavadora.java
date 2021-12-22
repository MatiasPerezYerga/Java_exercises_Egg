package guia9.ej2;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        super.crearElectrodomestico();
        
        System.out.println("Que capacidad de carga tiene la Lavadora?");
        carga = 100;

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio = precio + 500;

        }
        System.out.println("El precio final de la lavadora es "+precio);
    }

    @Override
    public String toString() {
        return "Lavadora {" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", carga=" + carga + '}';
    }

       
}
