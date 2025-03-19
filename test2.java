import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        greetUser();
                        break;
                    case 2:
                        checkEvenOdd(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
            }
        } while (choice != 3);

        scanner.close();
    }

    static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    static void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                System.out.println(number + " is an Odd number.");
            } else {
                System.out.println(number + " is an Even number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume invalid input
        }
    }
}
