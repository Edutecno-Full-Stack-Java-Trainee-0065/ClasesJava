package objetos;

public class FuentePoder {
    private String tipoFuentePoder;
    private String tipoVoltaje;

    public FuentePoder() {
    }

    public FuentePoder(String tipoFuentePoder, String tipoVoltaje) {
        this.tipoFuentePoder = tipoFuentePoder;
        this.tipoVoltaje = tipoVoltaje;
    }

    public String getTipoFuentePoder() {
        return tipoFuentePoder;
    }

    public void setTipoFuentePoder(String tipoFuentePoder) {
        this.tipoFuentePoder = tipoFuentePoder;
    }

    public String getTipoVoltaje() {
        return tipoVoltaje;
    }

    public void setTipoVoltaje(String tipoVoltaje) {
        this.tipoVoltaje = tipoVoltaje;
    }

    @Override
    public String toString() {
        return "FuentePoder{" +
                "tipoFuentePoder='" + tipoFuentePoder + '\'' +
                ", tipoVoltaje='" + tipoVoltaje + '\'' +
                '}';
    }
}
