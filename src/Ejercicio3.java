import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        crearList();
        var scanner = new Scanner(System.in);
        int index;
        do {
            imprimirLista(crearList());
            System.out.print("Ingrese Index: ");
            index = scanner.nextInt();
            if (index < 4 && index >= 0) {
                System.out.println(crearList().get(index));
                System.out.println("\n");
            } else {
                System.out.println("Index no existe");
                System.out.println("\n");
            }
        }
        while (index != -1);
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
            System.out.println(list.indexOf(i) + "  " + i);
        }
    }
}
