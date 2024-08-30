package sesion8.ejemplos;

public class Cuadrado extends FiguraGeometrica {

    private double tamanoLado;

    public Cuadrado() {
    }

    public Cuadrado(String color, double tamanoLado) {
        super(color);
        this.tamanoLado = tamanoLado;
    }

    public double getTamanoLado() {
        return tamanoLado;
    }

    public void setTamanoLado(double tamanoLado) {
        this.tamanoLado = tamanoLado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "color=" + getColor() +
                ", tamanoLado=" + tamanoLado +
                '}';
    }
}
