package sesion7;

public abstract class Animal {
    // Atributos
    private int numeroPatas;
    private String tipoReproduccion;

    // Constructores
    public Animal() {}

   public Animal(int numeroPatas, String tipoReproduccion) {
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
   }

   // Getters y Setters
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    // Metodos/FUnciones o comportamientos
    @Override
    public String toString() {
        return "Animal{" +
                "numeroPatas=" + numeroPatas +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                '}';
    }
}
