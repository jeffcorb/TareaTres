import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var map = crearMap();
        int opcion;
        var scanner = new Scanner(System.in);
        do {
            imprimirMap(map);
            System.out.print("Ingrese Opcion: ");
            opcion = scanner.nextInt();
            var contieneKey = map.containsKey(opcion);

            if (contieneKey) {
                System.out.println(map.get(opcion));
                System.out.println("\n");
            } else {
                System.out.println("Eso no existe");
                System.out.println("\n");
            }
        }
        while (opcion != -1);
        scanner.close();
    }

    static Map<Integer, String> crearMap() {
        var map = new HashMap<Integer, String>();
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.put(4, "Cuatro");
        map.put(5, "Cinco");
        return map;
    }

    static void imprimirMap(Map<Integer, String> map) {
        for (var set : map.entrySet()) {
            System.out.println("Key: " + set.getKey() + " |  Value: " + set.getValue());
        }
    }
}
