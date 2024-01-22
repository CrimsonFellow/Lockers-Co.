package backend;

import java.util.LinkedList;
import java.util.Scanner;

public class FileOperationsMenu {
    private static LinkedList<String> fileNames = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Displays the menu with file operation options
    public static void showFileOperationsMenu() {
        while (true) {
            System.out.println("File Operations Menu");
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search for a file");
            System.out.println("4. Return to the main context");
            System.out.println("");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            System.out.println("");
            scanner.nextLine();

            // Switch statement for user's choice
            switch (choice) {
                case 1:
                    addFile();
                    break;
                case 2:
                    deleteFile();
                    break;
                case 3:
                    searchFile();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    
    // Displays file names in ascending order
    public static void showFileNames() {
        if (!fileNames.isEmpty()) {
            fileNames.sort(String::compareTo);
            System.out.println("File names in ascending order:");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("The list of file names is empty.");
        }
    }

    // Adds file to the list
    private static void addFile() {
    	System.out.print("Enter the file name to add: ");
        String fileName = scanner.nextLine();

        if (!fileNames.contains(fileName)) {
            fileNames.add(fileName);
            System.out.println("File added successfully: " + fileName);
        } else {
            System.out.println("File already exists: " + fileName);
        }
    }

    // Deletes file from the list
    private static void deleteFile() {
    	System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();

        if (fileNames.remove(fileName)) {
            System.out.println("File deleted successfully: " + fileName);
        } else {
            System.out.println("File not found: " + fileName);
        }
    }

    // Searches for file in the list
    private static void searchFile() {
    	 System.out.print("Enter the file name to search: ");
         String fileName = scanner.nextLine();

         if (fileNames.contains(fileName)) {
             System.out.println("File found: " + fileName);
         } else {
             System.out.println("File not found: " + fileName);
         }
    }
}


