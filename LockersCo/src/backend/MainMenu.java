package backend;

import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);

    // Entry point of the program
    public static void main(String[] args) {
        WelcomeMenu.showWelcomeScreen();
        showMainMenu();
    }

    // Displays the main menu and handles user input
    private static void showMainMenu() {
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Show current file names (Ascending order)");
            System.out.println("2. File operations");
            System.out.println("3. Close the application");
            System.out.println("");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            System.out.println("");
            scanner.nextLine(); 

            // Switch statement for user's choice //
            switch (choice) {
                case 1:
                    FileOperationsMenu.showFileNames();
                    break;
                case 2:
                    FileOperationsMenu.showFileOperationsMenu();
                    break;
                case 3:
                    closeApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    // Closes the application //
    private static void closeApplication() {
        System.out.println("Closing the application. Goodbye!");
        scanner.close();
        System.exit(0);
    }
}


