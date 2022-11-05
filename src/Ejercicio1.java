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
        while (!opcion.equals("Despedirme"));
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
                System.out.println("Hola, como estas?");
                System.out.println("\n");
                break;

            case "Hora":
                System.out.println("“Ok, te diré la hora”");
                System.out.println("\n");
                break;

            case "Comida":
                System.out.println("“Es hora de comer!”");
                System.out.println("\n");
                break;

            case "Despedirse":
                System.out.println("“Adios”");
                System.out.println("\n");
                break;

            default:
                System.out.println("opcion Incorrecta");
        }
    }
}

