package sesion11.evaliacion;

import java.util.Date;

public class Pelicula {

    private String titulo;
    private Date annoEstreno;
    private boolean disponible;

    public Pelicula() {
    }

    public Pelicula(String titulo, Date annoEstreno, boolean disponible) {
        this.titulo = titulo;
        this.annoEstreno = annoEstreno;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAnnoEstreno() {
        return annoEstreno;
    }

    public void setAnnoEstreno(Date annoEstreno) {
        this.annoEstreno = annoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", annoEstreno=" + annoEstreno +
                ", disponible=" + disponible +
                '}';
    }
}
