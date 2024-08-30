package sesion7;

public class Pato extends Animal implements Alimentacion, Desplazamiento {
    // Atributos
    private String colorPlumas;

    // Constructores
    public Pato() {}

    public Pato(String colorPlumas, int numeroPatas, String tipoReproduccion) {
        super(numeroPatas, tipoReproduccion);
        this.colorPlumas = colorPlumas;
    }

    // Getters y Setters
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    // Metodos
    @Override
    public String toString() {
        return "Pato{" +
                "numeroPatas='" + getNumeroPatas() + '\'' +
                ", tipoReproduccion='" + getTipoReproduccion() + '\'' +
                ", colorPlumas='" + colorPlumas + '\'' +
                '}';
    }

    @Override
    public void alimentarse() {
        System.out.println("Estoy comiendo verduras y uno que otro leon...");
    }

    @Override
    public void desplazamiento() {
        System.out.println("Puedo correr, volar, nadar...");
    }
}
