import java.util.Scanner;

public class OperacionesColaDoble {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ColaDoble<String> miColaDoble = new ColaDoble<>();
            int opcion;

            do {
                System.out.println("\n--- Operaciones de Cola Doble ---");
                System.out.println("1. Colocar al Frente");
                System.out.println("2. Colocar al Final");
                System.out.println("3. Quitar del Frente");
                System.out.println("4. Quitar del Final");
                System.out.println("5. Mostrar Frente");
                System.out.println("6. Mostrar Final");
                System.out.println("7. ¿Está Vacía?");
                System.out.println("0. Salir");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el elemento/nombre para añadir al frente: ");
                        String elementoFrente = scanner.nextLine();
                        miColaDoble.encolarAlFrente(elementoFrente);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el elemento/nombre para añadir al final: ");
                        String elementoFinal = scanner.nextLine();
                        miColaDoble.encolarAlFinal(elementoFinal);
                    }
                    case 3 -> miColaDoble.desencolarDelFrente();
                    case 4 -> miColaDoble.desencolarDelFinal();
                    case 5 -> miColaDoble.mostrarFrente();
                    case 6 -> miColaDoble.mostrarFinal();
                    case 7 -> {
                        if (miColaDoble.estaVacia()) {
                            System.out.println("La cola doble está vacía.");
                        } else {
                            System.out.println("La cola doble no está vacía.");
                        }
                    }
                    case 0 -> System.out.println("Saliendo de las operaciones de cola doble.");
                    default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } while (opcion != 0);
        }
    }
}