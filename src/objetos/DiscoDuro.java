package objetos;

public class DiscoDuro {

    private String tipoDiscoDuro; // SSD o HDD
    private String memoriaDiscoDuro;
    private int numeroDeDiscosDuros;

    public DiscoDuro() {
    }

    public DiscoDuro(String tipoDiscoDuro, String memoriaDiscoDuro, int numeroDeDiscosDuros) {
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.memoriaDiscoDuro = memoriaDiscoDuro;
        this.numeroDeDiscosDuros = numeroDeDiscosDuros;
    }

    public String getTipoDiscoDuro() {
        return tipoDiscoDuro;
    }

    public void setTipoDiscoDuro(String tipoDiscoDuro) {
        this.tipoDiscoDuro = tipoDiscoDuro;
    }

    public String getMemoriaDiscoDuro() {
        return memoriaDiscoDuro;
    }

    public void setMemoriaDiscoDuro(String memoriaDiscoDuro) {
        this.memoriaDiscoDuro = memoriaDiscoDuro;
    }

    public int getNumeroDeDiscosDuros() {
        return numeroDeDiscosDuros;
    }

    public void setNumeroDeDiscosDuros(int numeroDeDiscosDuros) {
        this.numeroDeDiscosDuros = numeroDeDiscosDuros;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "tipoDiscoDuro='" + tipoDiscoDuro + '\'' +
                ", memoriaDiscoDuro='" + memoriaDiscoDuro + '\'' +
                ", numeroDeDiscosDuros=" + numeroDeDiscosDuros +
                '}';
    }
}
