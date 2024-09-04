package sesion11;

public class Bridge {
    private IBridge color;

    public Bridge(IBridge color) {
        this.color = color;
    }

    public void demostration() {
        if (color != null) {
            color.color();
        }
    }
}
