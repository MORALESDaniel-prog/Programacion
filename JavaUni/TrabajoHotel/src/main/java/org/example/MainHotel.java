package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        listaHabitaciones(habitaciones);
        listadoClientes(clientes, habitaciones);
    }

    private static void listadoClientes(ArrayList<Cliente> clientes, ArrayList<Habitacion> habitaciones) {
        registrarClientes(clientes, habitaciones);
    }

    private static void registrarClientes(ArrayList<Cliente> clientes, ArrayList<Habitacion> habitaciones) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de clientes no mas de 3: ");
        int cantidadDeclientes = Integer.parseInt(scanner.nextLine());
        if(cantidadDeclientes <=3) {
            for (int i = 0; i < cantidadDeclientes; i++) {
                System.out.println("Ingrese el nombre del cliente: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el numero del Dni: ");
                String Dni = scanner.nextLine();
                System.out.println("Ingrese el numero de la habitacion que desea elegir: ");
                int numeroHabitacion = Integer.parseInt(scanner.nextLine());
                Cliente cliente = new Cliente(nombre,Dni,numeroHabitacion);
                clientes.add(cliente);
                System.out.println("clientes registrads:");
                for(Cliente ignored : clientes){
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Dni: " + cliente.getDni());
                    System.out.println("Numero de habitacion: " + cliente.getNumeroHabitacion());
                }
            }
        }else{
            System.out.println("No hay habitaciones para tantos clientes vuelva a intentarlo");
        }
    }
    public static void listaHabitaciones(ArrayList<Habitacion> habitaciones){
        registrarHabitaciones(habitaciones);
    }

    private static void registrarHabitaciones(ArrayList<Habitacion> habitaciones) {
        Habitacion habitacion1 = new Habitacion(101,60000,"Simple");
        Habitacion habitacion2 = new Habitacion(102,90000,"Doble");
        Habitacion habitacion3 =new Habitacion(103,120000,"Suit");
        habitaciones.add(habitacion1);
        habitaciones.add(habitacion2);
        habitaciones.add(habitacion3);
        System.out.println("Habitaciones disponibles:");
        System.out.println("Numero: " + habitacion1.getNumero() + "Precio: " + habitacion1.getPrecio() + "Tipo: " + habitacion1.getTipo());
        System.out.println("Numero: " + habitacion2.getNumero() + "Precio: " + habitacion2.getPrecio() + "Tipo: " + habitacion2.getTipo());
        System.out.println("Numero: " + habitacion3.getNumero() + "Precio: " + habitacion3.getPrecio() + "tipo: " + habitacion3.getTipo());

    }
}
