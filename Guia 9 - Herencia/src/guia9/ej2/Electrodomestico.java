package guia9.ej2;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;
    protected Scanner leer = new Scanner(System.in);

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public void comprobarConsumoEnergetico() {
        if ("A".equals(consumoEnergetico) || "B".equals(consumoEnergetico) || "C".equals(consumoEnergetico) || "D".equals(consumoEnergetico) || "E".equals(consumoEnergetico) || "F".equals(consumoEnergetico)) {
            System.out.println("El consumo energético es invalido. Se asgina como valor por defecto el tipo F");
            consumoEnergetico = 'F';
            System.out.println(consumoEnergetico);

        } else {
            System.out.println("Consumo energetico verificado: " + consumoEnergetico);
        }

    }

    public void comprobarColor(String color) {

        String a = color.toLowerCase();
        if (a.equals("blanco") || a.equals("negro") || a.equals("rojo") || a.equals("azul") || a.equals("gris")) {

            System.out.println("Color comprobado");

        } else {
            System.out.println("El color no es válido. Se asignará por defecto blanco.");
            this.color = "blanco";

        }
    }

    public void crearElectrodomestico() {

        System.out.println("Ingrese el color:");
        color = leer.next();
        comprobarColor(color);
        
        System.out.println("Ingrese el consumo energético");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println(consumoEnergetico);
        comprobarConsumoEnergetico();
        
        System.out.println("Ingrese el peso del electrodoméstico en Kg: ");
        peso = leer.nextDouble();

        precio = 1000.00;
        System.out.println("Se asigna un precio estandar de $1000");
        
    }

    public void precioFinal() {
        char a = consumoEnergetico;
        String s=String.valueOf(a);  
        
        if ("a".equals(a)||(peso>80)) {
            precio = 1000.00;
        } else if ("b".equals(a)||(peso>50 && peso<79)) {
            precio = 800.00;
        } else if ("c".equals(a)){
            precio = 600.00;
        } else if ("d".equals(a)||(peso>20 && peso<49)) {
            precio = 500.00;
        } else if ("e".equals(a)) {
            precio = 300.00;
        } else if ("f".equals(a)||(peso>1 && peso<19)) {
            precio = 100.00;
        }
        System.out.println("El precio final del electrodomestico es: "+precio);
        
    }

}
