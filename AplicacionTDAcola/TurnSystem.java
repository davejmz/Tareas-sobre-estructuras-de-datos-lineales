package AplicacionTDAcola;

import java.util.Scanner;

public class TurnSystem {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            TurnOrder<String> serviceQueue = new TurnOrder<>();
            
            int choice;
            do {
                System.out.println("\n*** Service Menu ***");
                System.out.println("1. Add Person to Queue");
                System.out.println("2. Serve Next Person");
                System.out.println("3. View Current Queue");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                input.nextLine();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the name of the person: ");
                        String name = input.nextLine();
                        serviceQueue.enqueue(name);
                    }
                    case 2 -> serviceQueue.serveNext();
                    case 3 -> serviceQueue.displayQueue();
                    case 4 -> System.out.println("Exiting the service system.");
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 4);
        }
    }
}