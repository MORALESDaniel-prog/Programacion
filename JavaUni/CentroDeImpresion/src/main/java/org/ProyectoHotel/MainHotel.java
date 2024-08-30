package org.ProyectoHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHotel {

    public void listaHabitaciones(ArrayList<Habitacion> habitaciones){

        habitaciones.add(new Habitacion(101,60000,"Simple"));
        habitaciones.add(new Habitacion(102,90000,"Doble"));
        habitaciones.add(new Habitacion(103,120000,"Suit"));

    }

    public static void listaClientes(ArrayList<Cliente> clientes, ArrayList<Habitacion> habitaciones){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de clientes: ");
        int cantidadDeclientes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cantidadDeclientes; i++) {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del Dni: ");
            String apellido = scanner.nextLine();
            System.out.println(habitaciones);
            System.out.println("Ingrese el numero de la habitacion que desea elegir: ");


        }

    }

    public static void main(String[] args) {

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
    }
}
