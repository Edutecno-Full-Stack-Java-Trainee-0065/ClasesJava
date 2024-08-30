package sesion8.evaluacion;

import java.util.Date;

public class Vegetales extends Producto {

    private Date fechaEnvasado;
    private Date fechaCaducidad;

    public Vegetales() {}

    public Vegetales(String nombre, String codigo, int precio, Date fechaEnvasado, Date fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Vegetales{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", fechaEnvasado='" + fechaEnvasado + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                '}';
    }
}
