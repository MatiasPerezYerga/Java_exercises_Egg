
package guia7.ej6.entidades;


public class Producto {
    
    private String nombre;
    private Long precio;
    private String categoria;

    public Producto(String nombre, Long precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
