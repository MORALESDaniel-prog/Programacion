package org.example;
public class Servicio implements IConsumible{
    public String servicionOfrecidos;
    @Override
    public void consumir(){
        servicionOfrecidos = "Spa ,restaurante y lipieza.";
    }
}