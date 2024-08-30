public  class vehiculo  {
    public String placa;
    public int numPasajeros;
    public Propietario propietario;

    public vehiculo(String placa, int numPasajeros, Propietario propietario) {
        this.placa = placa;
        this.numPasajeros = numPasajeros;
        this.propietario = propietario;
    }
    public String getPlaca() {
        return placa;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public Propietario getPropietario() {
        return propietario;
    }
}
