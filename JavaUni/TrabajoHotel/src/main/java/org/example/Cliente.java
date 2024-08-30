package org.example;
public class Cliente {
    public String nombre;
    public String Dni;
    public int numeroHabitacion;
    public Cliente(String nombre, String Dni, int numeroHabitacion) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
}