public class vehiculoTransporte extends vehiculo{
    public int maximoPasajeros;

    public vehiculoTransporte(String placa,String modelo, String marca, String color, String numeroChasis, int maximoPasajeros) {
        super(placa,modelo,marca,color,numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
    }
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }
    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
}
