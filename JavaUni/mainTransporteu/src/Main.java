import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void mostrarPasajerosPorPlaca(ArrayList<vehiculo> vehiculos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la placa del vehiculo que desea buscar:");
        String placa = scanner.nextLine();
        for (vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                System.out.println("El numero de pasajeros en el vehiculo de placa: " + placa + "es: " + vehiculo.getNumPasajeros());
                return;
            }
        }
        System.out.println("No se encontro un vehiculo con la placa: " + placa);
    }

    public static void main(String[] args) {
        ArrayList<vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la placa del vehiculo " + (i + 1) + ":");
            String placa = scanner.nextLine();
            System.out.println("Ingrese el numero de pasajeros del vehiculo " + (i + 1) + ":");
            String numPasajerosStr = scanner.nextLine();
            int numPasajeros = 0;
            if (numPasajerosStr != null && !numPasajerosStr.isEmpty()) {
                numPasajeros = Integer.parseInt(numPasajerosStr);
            } else {
                System.out.println("Por favor, ingrese un número válido.");
            }
            System.out.println("Ingrese el nombre del propietario del vehiculo " + (i + 1) + ":");
            String nombrePropietario = scanner.nextLine();
            Propietario propietario = new Propietario(nombrePropietario);
            vehiculo vehiculo = new vehiculo(placa, numPasajeros, propietario);
            vehiculos.add(vehiculo);
        }
        Propietario propietario1 = new Propietario("Daniel");
        vehiculos.add(new vehiculo("ASW123", 30, propietario1));
        vehiculos.add(new vehiculo("DFX321", 20, propietario1));
        vehiculos.add(new vehiculo("WER453", 40, propietario1));
        mostrarPasajerosPorPlaca(vehiculos);
        for (vehiculo vehiculo : vehiculos) {
            System.out.println("Placa:" + vehiculo.getPlaca());
            System.out.println("Numero de pasajeros:" + vehiculo.getNumPasajeros());
            System.out.println("Nombre del propietario:" + vehiculo.getPropietario().getNombre());
        }
        int totalPasajeros = 0;
        for (vehiculo vehiculo : vehiculos) {
            totalPasajeros += vehiculo.getNumPasajeros();
        }
        System.out.println("Total de pasajeros:" + totalPasajeros);
    }
}
//@Override