import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void listaUsuarios(ArrayList<usuario>usuarios) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese la cantidad de usuarios que va a registrar:  ");
        int cantidadUsuarios = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidadUsuarios; i++ ) {
            System.out.println("Digite el nombre del usuario: " + (i+1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Digite la edad del usuario: " + (i+1) + ":");
            int edad = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite el peso del usuario " + (i+1) + ":");
            double peso = Double.parseDouble(scanner.nextLine());
            usuario Usuario= new usuario(nombre, edad, peso);
            usuarios.add(Usuario);
        }

        for (int i = 0; i < cantidadUsuarios; i++ ) {
            int UsuariosTerceraEdad = 0;
            if(usuarios.get(i).getEdad()> 40){
                UsuariosTerceraEdad += 1;
                System.out.println("La cantidad de usuarios de la tercera edad es: " + UsuariosTerceraEdad);
            }
        }

        for (int i = 0; i < cantidadUsuarios; i++) {
            if(usuarios.get(i).getPeso()> 70) {
                System.out.println("Usuarios que superan el peso para abordar el vehiculo: ");
                System.out.println("Usuario " + (i + 1) + ":");
                System.out.println("Nombre: " + usuarios.get(i).getNombre());
                System.out.println("Edad: " + usuarios.get(i).getEdad());
                System.out.println("Peso: " + usuarios.get(i).getPeso());
            }else{
                System.out.println("Usuarios que pueden ingresar al vehiculo: ");
                System.out.println("Usuario #" + (i + 1) + ":");
                System.out.println("Nombre: " + usuarios.get(i).getNombre());
                System.out.println("Edad: " + usuarios.get(i).getEdad());
                System.out.println("Peso: " + usuarios.get(i).getPeso());
            }
        }

    }

    public static void listaVehiculos(ArrayList<vehiculoTransporte>vehiculos){
        Scanner scanner = new Scanner(System.in);

        vehiculoTransporte vehiculo = new vehiculoTransporte("QWE123","715","Volvo","Azul","432765", 20);
        vehiculoTransporte vehiculo2 = new vehiculoTransporte("WER123","715","Volvo","Verde","542765", 40);
        vehiculoTransporte vehiculo3 = new vehiculoTransporte("ERT123","715","Volvo","Amarillo","762765", 30);

        vehiculos.add(vehiculo);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        System.out.println("Ingrese la placa del vehiculo que desea buscar la cantidad de usuarios:  ");
        String placa = scanner.nextLine();

        for (vehiculoTransporte vehiculoTransporte: vehiculos) {
            if(vehiculoTransporte.getPlaca().equals(placa)){
                System.out.println("El numero de pasajeros del vehiculo con placa " + placa + " es: " + vehiculoTransporte.getMaximoPasajeros());
                return;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<vehiculoTransporte> vehiculos = new ArrayList<>();
        ArrayList<usuario> usuarios = new ArrayList<>();
        listaUsuarios(usuarios);
        listaVehiculos(vehiculos);
    }
}