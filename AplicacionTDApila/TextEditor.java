import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pile<String> editor = new Pile<>();

        while (true) {
            System.out.println("\nOpciones del Editor:");
            System.out.println("1. Escribir línea");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Ingrese línea de texto: ");
                    String line = scanner.nextLine();
                    editor.addLine(line);
                }
                case "2" -> editor.undo();
                case "3" -> editor.redo();
                case "4" -> editor.display();
                case "5" -> {
                    System.out.println("Saliendo del editor.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}