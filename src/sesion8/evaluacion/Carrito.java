package sesion8.evaluacion;

public interface Carrito {
    void agregarCarrito(Producto producto);
    void mostrarCarrito();
    void pagarCarrito(String nombre, String rut);
}

