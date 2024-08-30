package org.ProyectoHotel;

public class Cliente {
    public String nombre;
    public String Dni;
    public Reserva reservasActivas;

    public Cliente(String nombre, String Dni, Reserva reservasActivas) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.reservasActivas = reservasActivas;
    }
}
