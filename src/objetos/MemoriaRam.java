package objetos;

public class MemoriaRam {
    private String tipoMemoria; // DDR3 - DDR4 - otras
    private int ram;

    public MemoriaRam() {
    }

    public MemoriaRam(String tipoMemoria, int ram) {
        this.tipoMemoria = tipoMemoria;
        this.ram = ram;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "MemoriaRam{" +
                "tipoMemoria='" + tipoMemoria + '\'' +
                ", ram=" + ram +
                '}';
    }
}
