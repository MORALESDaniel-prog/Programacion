package org.ProyectoHotel;

public class Habitacion {
    public int numero;
    public int precio;
    public String tipo;

    public Habitacion(int numero, int precio, String tipo) {
        this.numero = numero;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
