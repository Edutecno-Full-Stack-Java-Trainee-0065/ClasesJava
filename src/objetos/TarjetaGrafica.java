package objetos;

public class TarjetaGrafica {
    private String tipoTarjetaGrafica;
    private String salidaVideo;

    public TarjetaGrafica() {
    }

    public TarjetaGrafica(String tipoTarjetaGrafica, String salidaVideo) {
        this.tipoTarjetaGrafica = tipoTarjetaGrafica;
        this.salidaVideo = salidaVideo;
    }

    public String getTipoTarjetaGrafica() {
        return tipoTarjetaGrafica;
    }

    public void setTipoTarjetaGrafica(String tipoTarjetaGrafica) {
        this.tipoTarjetaGrafica = tipoTarjetaGrafica;
    }

    public String getSalidaVideo() {
        return salidaVideo;
    }

    public void setSalidaVideo(String salidaVideo) {
        this.salidaVideo = salidaVideo;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "tipoTarjetaGrafica='" + tipoTarjetaGrafica + '\'' +
                ", salidaVideo='" + salidaVideo + '\'' +
                '}';
    }
}
