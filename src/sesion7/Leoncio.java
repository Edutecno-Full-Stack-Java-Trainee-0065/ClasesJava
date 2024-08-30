package sesion7;

public class Leoncio extends Animal implements Desplazamiento, Alimentacion {
    // Atributo
    private int kilosDeCarne;

    // Constructores
    public Leoncio() {}

    public Leoncio(int numeroPatas, String tipoReproduccion, int kilosDeCarne) {
        super(numeroPatas, tipoReproduccion);
        this.kilosDeCarne = kilosDeCarne;
    }

    // Getters y Setters
    public int getKilosDeCarne() {
        return kilosDeCarne;
    }

    public void setKilosDeCarne(int kilosDeCarne) {
        this.kilosDeCarne = kilosDeCarne;
    }

    // Metodos/Funciones o comportamientos
    @Override
    public String toString() {
        return "Leoncio{" +
                "numeroDePatas=" + getNumeroPatas() +
                ", tipoReproduccion=" + getTipoReproduccion() +
                ", kilosDeCarne=" + kilosDeCarne +
                '}';
    }

    @Override
    public void alimentarse() {
        System.out.println("Todo menos pato...");
    }

    @Override
    public void desplazamiento() {
        System.out.println("Puedo correr, del pato...");
    }
}
