package backend;

import java.util.Arrays;
import java.util.Scanner;

public class FileOperationsMenu {
    private static String[] fileNames = new String[100]; // Assuming a maximum of 100 files
    private static int fileCount = 0; // To keep track of the number of files
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

    // Displays file names in alphabetical order
    public static void showFileNames() {
        if (fileCount > 0) {
            Arrays.sort(fileNames, 0, fileCount);
            System.out.println("File names in alphabetical order:");
            for (int i = 0; i < fileCount; i++) {
                System.out.println(fileNames[i]);
            }
        } else {
            System.out.println("The list of file names is empty.");
        }
    }

    // Adds file to the list
    private static void addFile() {
        System.out.print("Enter the file name to add: ");
        String fileName = scanner.nextLine();

        if (fileCount < fileNames.length) {
            fileNames[fileCount++] = fileName;
            System.out.println("File added successfully: " + fileName);
        } else {
            System.out.println("Cannot add more files. The list is full.");
        }
    }

    // Deletes file from the list
    private static void deleteFile() {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();

        for (int i = 0; i < fileCount; i++) {
            if (fileNames[i].equals(fileName)) {
                // Shift elements to remove the file name
                for (int j = i; j < fileCount - 1; j++) {
                    fileNames[j] = fileNames[j + 1];
                }
                fileNames[--fileCount] = null; 
                System.out.println("File deleted successfully: " + fileName);
                return;
            }
        }
        System.out.println("File not found: " + fileName);
    }

    // Searches for file in the list
    private static void searchFile() {
        System.out.print("Enter the file name to search: ");
        String fileName = scanner.nextLine();

        for (int i = 0; i < fileCount; i++) {
            if (fileNames[i].equals(fileName)) {
                System.out.println("File found: " + fileName);
                return;
            }
        }
        System.out.println("File not found: " + fileName);
    }
}


