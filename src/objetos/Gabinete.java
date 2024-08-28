package objetos;

public class Gabinete {
    private String tipoGabinete;
    private String procesador;
    private int cantidadPuertos;
    private String tarjetaDeRed;
    private String refrigeracion;
    private String tipoSocket;
    private String tipoPc; // Gamer, no Gamer

    public Gabinete() {
    }

    public Gabinete(String tipoGabinete, String procesador, int cantidadPuertos, String tarjetaDeRed, String refrigeracion, String tipoSocket, String tipoPc) {
        this.tipoGabinete = tipoGabinete;
        this.procesador = procesador;
        this.cantidadPuertos = cantidadPuertos;
        this.tarjetaDeRed = tarjetaDeRed;
        this.refrigeracion = refrigeracion;
        this.tipoSocket = tipoSocket;
        this.tipoPc = tipoPc;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getCantidadPuertos() {
        return cantidadPuertos;
    }

    public void setCantidadPuertos(int cantidadPuertos) {
        this.cantidadPuertos = cantidadPuertos;
    }

    public String getTarjetaDeRed() {
        return tarjetaDeRed;
    }

    public void setTarjetaDeRed(String tarjetaDeRed) {
        this.tarjetaDeRed = tarjetaDeRed;
    }

    public String getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public String getTipoSocket() {
        return tipoSocket;
    }

    public void setTipoSocket(String tipoSocket) {
        this.tipoSocket = tipoSocket;
    }

    public String getTipoPc() {
        return tipoPc;
    }

    public void setTipoPc(String tipoPc) {
        this.tipoPc = tipoPc;
    }

    @Override
    public String toString() {
        return "Gabinete{" +
                "tipoGabinete='" + tipoGabinete + '\'' +
                ", procesador='" + procesador + '\'' +
                ", cantidadPuertos=" + cantidadPuertos +
                ", tarjetaDeRed='" + tarjetaDeRed + '\'' +
                ", refrigeracion='" + refrigeracion + '\'' +
                ", tipoSocket='" + tipoSocket + '\'' +
                ", tipoPc='" + tipoPc + '\'' +
                '}';
    }
}
