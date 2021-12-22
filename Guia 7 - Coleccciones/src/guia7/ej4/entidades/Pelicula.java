
package guia7.ej4.entidades;


public class Pelicula {

private String titulo;
private String director;
private Float horas;

    public Pelicula(String titulo, String director, Float horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Float getHoras() {
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(Float horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }


    
}
