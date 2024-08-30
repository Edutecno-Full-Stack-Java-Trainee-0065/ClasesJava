package sesion8.evaluacion;

public class Vendedor {

    private String nombre;
    private String RUT;

    public Vendedor() {
    }

    public Vendedor(String nombre, String RUT) {
        this.nombre = nombre;
        this.RUT = RUT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", RUT='" + RUT + '\'' +
                '}';
    }
}
