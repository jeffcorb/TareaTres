import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String opcion;
        var scanner = new Scanner(System.in);
        do {
            imprimirMenu();
            System.out.print("Ingrese Opcion: ");
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        }
        while (!opcion.equals("Despedirse"));
    }

    static void imprimirMenu() {
        System.out.println("■ Saludarme");

        System.out.println("■ Hora ");

        System.out.println("■ Comida");

        System.out.println("■ Despedirse");
    }

    static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "Saludarme":
                System.out.println("Hola, como estas?\n");
                break;

            case "Hora":
                System.out.println("Ok, te diré la hora\n");

                break;

            case "Comida":
                System.out.println("Es hora de comer!\n");
                break;

            case "Despedirse":
                System.out.println("Adios\n");
                break;

            default:
                System.out.println("opcion Incorrecta");
        }
    }
}

