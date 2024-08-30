package sesion8.ejemplos;

public class FiguraGeometrica implements Interface {

    private String color;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void colorear(Object objecto) {
        System.out.println("Estoy pintando un " + objecto);
    }
}
