import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var index = 0;

        do {
            var lista = crearList();
            imprimirLista(crearList());
            System.out.println("\n Ingrese Index: ");
            index = scanner.nextInt();
            try {
                lista.get(index);
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index no existe\n");
            }
        }
        while (index != -1);
        scanner.close();
    }

    static ArrayList crearList() {
        var lista = new ArrayList<>();

        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Aloha");
        lista.add("Bota vieja");

        return lista;
    }

    static void imprimirLista(List<String> list) {
        for (var i : list) {
            System.out.printf(i + " ");
        }
    }
}
