package objetos;


public class ComputadorDeEscritorio {
    private String OS;
    private DiscoDuro discoDuro;
    private FuentePoder fuentePoder;
    private Gabinete gabinete;
    private Perifericos perifericos; // utilizar modelamiento mas complejo.

    public ComputadorDeEscritorio() {}

    public ComputadorDeEscritorio(String OS, DiscoDuro discoDuro, FuentePoder fuentePoder, Gabinete gabinete, Perifericos perifericos) {
        this.OS = OS;
        this.discoDuro = discoDuro;
        this.fuentePoder = fuentePoder;
        this.gabinete = gabinete;
        this.perifericos = perifericos;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public FuentePoder getFuentePoder() {
        return fuentePoder;
    }

    public void setFuentePoder(FuentePoder fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Perifericos getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(Perifericos perifericos) {
        this.perifericos = perifericos;
    }

    @Override
    public String toString() {
        return "ComputadorDeEscritorio{" +
                "OS='" + OS + '\'' +
                ", discoDuro=" + discoDuro +
                ", fuentePoder=" + fuentePoder +
                ", gabinete=" + gabinete +
                ", perifericos=" + perifericos +
                '}';
    }
}
