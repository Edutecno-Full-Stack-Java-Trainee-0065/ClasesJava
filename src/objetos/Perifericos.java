package objetos;

public class Perifericos {
    private String teclado;
    private String mouse;
    private String pantalla;
    private String parlante;

    public Perifericos() {
    }

    public Perifericos(String teclado, String mouse, String pantalla, String parlante) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.pantalla = pantalla;
        this.parlante = parlante;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getParlante() {
        return parlante;
    }

    public void setParlante(String parlante) {
        this.parlante = parlante;
    }

    @Override
    public String toString() {
        return "Perifericos{" +
                "teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", parlante='" + parlante + '\'' +
                '}';
    }
}
