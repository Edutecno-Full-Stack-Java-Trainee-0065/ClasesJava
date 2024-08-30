package sesion8.ejemplos;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo() {
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color=" + getColor() +
                ", radio=" + radio +
                '}';
    }
}
