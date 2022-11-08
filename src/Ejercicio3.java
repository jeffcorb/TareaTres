import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        crearList();
        var scanner = new Scanner(System.in);
        int index;
        try {
            do {
                imprimirLista(crearList());
                System.out.print("Ingrese Index: ");
                index = scanner.nextInt();
            }
            while (index != -1);

        } catch (ExcepcionRango e) {
            System.out.println("Index no existe\n");
        }

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
            System.out.printf(list.indexOf(i) + "  " + i);
        }
    }

    public void validarRango(int num) throws ExcepcionRango {
        if ((num > 4) || (num < 0)) {
            throw new ExcepcionRango("Index no existe\n");
        }
    }

    public class ExcepcionRango extends Exception {
        public ExcepcionRango(String msj_error) {
            super(msj_error);
        }
    }
}
