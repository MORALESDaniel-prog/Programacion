public class vehiculoCarga  {
    public double capacidadCarga;
    public int numeroEjes;

    public vehiculoCarga(double capacidadCarga, int numeroEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
