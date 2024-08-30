package sesion8.evaluacion;

public class Venta {
    private Vendedor vendedor;
    private int ganancia;

    public Venta(Vendedor vendedor, int ganancia) {
        this.vendedor = vendedor;
        this.ganancia = ganancia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getGanancia() {
        return ganancia;
    }
}
