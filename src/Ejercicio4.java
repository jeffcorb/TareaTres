import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var lista = CrearLista();
        var mapPrecio = crearMapPrecio(lista);
        var mapStock = crearMapStock(lista);
        String opcion;
        var scanner = new Scanner(System.in);
        do {
            imprimirKeysMayusculas(mapStock);
            System.out.print("Ingrese Key: ");
            opcion = scanner.nextLine();
            final var precio = mapPrecio.get(opcion);
            final var stock = mapStock.get(opcion);
            if (mapStock.containsKey(opcion)) {
                var mensaje = String.format("El item %s tiene un precio de %.2f y su stock es de %d unidades.", opcion, precio, stock);
                System.out.println(mensaje);
            }
        }
        while (mapStock.containsKey(opcion));
    }

    static List<String> CrearLista() {
        var list = new ArrayList<String>();
        list.add("25.12USD,Chompa,3");
        list.add("741.12USD,Polera,15");
        list.add("9000.1USD,Casaca,2");
        list.add("90.00USD,Zapato,1");

        return list;
    }

    static Map<String, Double> crearMapPrecio(List<String> list) {
        final var map = new HashMap<String, Double>();

        for (var item : list) {
            var partes = Arrays.asList(item.split(","));
            var nombre = partes.get(1);
            var precio = Double.parseDouble(partes.get(0).substring(0, partes.get(0).indexOf('U')));
            map.put(nombre, precio);
        }
        return map;
    }

    static Map<String, Integer> crearMapStock(List<String> list) {
        final var map = new HashMap<String, Integer>();

        for (var item : list) {
            var partes = Arrays.asList(item.split(","));
            var nombre = partes.get(1);
            var stock = Integer.parseInt(partes.get(2));
            map.put(nombre, stock);
        }
        return map;
    }

    static void imprimirKeysMayusculas(Map<String, Integer> map) {
        for (var set : map.entrySet()) {
            System.out.println(set.getKey().toUpperCase());
        }
    }
}
