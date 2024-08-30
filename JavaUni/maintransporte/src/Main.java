import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Map<String, vehiculoCarga> vehiculos= new HashMap<>();
        vehiculos.put("ASW123", new vehiculoCarga("ASW123",32));

       // vehiculoCarga vehiculoCarga1 = new vehiculoCarga("ASW233", 32);
       // vehiculoCarga vehiculoCarga2 = new vehiculoCarga("DHX654", 40);
       // vehiculoCarga vehiculoCarga3 = new vehiculoCarga("EFT235", 50);
       // propietario propietario1 = new propietario("Daniel", vehiculoCarga3);
       // propietario propietario2 = new propietario("Daniel", vehiculoCarga2);
       // propietario propietario3 = new propietario("Daniel", vehiculoCarga1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del propietario");
        String nombrePropietario= scanner.nextLine();
        System.out.println("Ingrese la placa del vehiculo");
        String placaVehiculo = scanner.nextLine();
        vehiculoCarga vehiculo = vehiculos.get(placaVehiculo);
        propietario Propietario = new propietario("Daniel",vehiculo);

        System.out.println("Ingrese la placa del vehiculo para registrar el numero de pasajeros");
        String placaVehiculo2 = scanner.nextLine();
        vehiculoCarga vehiculo2 = vehiculos.get(placaVehiculo2);
        int totalPasajeros = vehiculo2.numeroPasajeros;
        System.out.println("Total de pasajeros transportados en el vehiculo" + totalPasajeros);

    }
}
