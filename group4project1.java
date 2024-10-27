package cmpe343group4project1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class group4project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        while (working) {
            printMenu();
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "A":
                    statisticalInformation();
                    break;
                case "B":
                    matrixOperations();
                    break;
                case "C":
                    textEncryptionDecryption(scanner);
                    break;
                case "D":
                    ticTacToe();
                    break;
                case "E":
                    System.out.println("Terminating the console. Goodbye!");
                    working = false;
                    break;
                default:
                    System.out.println("This option is invalid, please try another option.");
            }
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Welcome to the Console Application of Group 4.");
        System.out.println("Please select the operation: ");
        System.out.println("[A] Statistical Information about an array.");
        System.out.println("[B] Matrix Operations");
        System.out.println("[C] Text Encryption/Decryption");
        System.out.println("[D] Tic-Tac-Toe Game");
        System.out.println("Press E to terminate the console.");
    }

    public static void statisticalInformation() {
        System.out.println("Statistical Information about an array.");
    }

    public static void matrixOperations() {
        System.out.println("Matrix Operations.");

        boolean inSubmenu = true;
        Scanner scan = new Scanner(System.in);

        while (inSubmenu) {
            System.out.println("Please select an operation");
            System.out.println("Enter 'A' for Transpose");
            System.out.println("Enter 'B' for Inverse");
            System.out.println("Enter 'C' for Matrix Multiplication");
            System.out.println("Enter 'D' for Element-Wise Matrix Multiplication");
            System.out.println("Press 'E' to return to the Main Menu");

            String submenu = scan.nextLine().toUpperCase();
            switch (submenu) {
                case "A":
                    TransposeMatrix();
                    break;
                case "B":
                    // Inverse();
                    break;
                case "C":
                    // MatrixMultiplication();
                    break;
                case "D":
                    ElementWiseMatrixMultip();
                    break;
                case "E":
                    inSubmenu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid operation.");
                    break;
            }
        }
    }

    public static void TransposeMatrix() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for your matrix:");
        int rows = -1;
        while (rows <= 0) {
            try {
                rows = input.nextInt();
                if (rows <= 0) {
                    System.out.println("You must enter a positive integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. You must enter a number. Try again.");
                input.next();
            }
        }

        System.out.println("Enter the number of columns for your matrix:");
        int cols = -1;
        while (cols <= 0) {
            try {
                cols = input.nextInt();
                if (cols <= 0) {
                    System.out.println("You must enter a positive integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. You must enter a number. Try again.");
                input.next();
            }
        }

        double[][] matrix = new double[rows][cols];
        double[][] transposedMatrix = new double[cols][rows];

        System.out.println("Please enter the elements for your matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        matrix[i][j] = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a double number. Try again.");
                        input.next();
                    }
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("The transposed matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ElementWiseMatrixMultip() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer row number for your matrices");
        int rows1 = -1;
        while (rows1 <= 0) {
            try {
                System.out.println("Enter a positive integer row number for your matrices:");
                rows1 = input.nextInt();
                if (rows1 <= 0) {
                    System.out.println("You must enter a positive integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. You must enter a number. Try again.");
                input.next();
            }
        }
        int rows2 = rows1;
        int rows3 = rows1;

        System.out.println("Please enter a positive integer column number for your matrices");
        int cols1 = -1;
        while (cols1 <= 0) {
            try {
                System.out.println("Please enter a positive integer column number for your matrices:");
                cols1 = input.nextInt();
                if (cols1 <= 0) {
                    System.out.println("You must enter a positive integer. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. You must enter a number. Try again.");
                input.next();
            }
        }

        int cols2 = cols1;
        int cols3 = cols1;

        double[][] matrix1 = new double[rows1][cols1];
        double[][] matrix2 = new double[rows2][cols2];
        double[][] resultMatrix = new double[rows3][cols3];

        System.out.println("Please enter the elements for your first matrix");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                while (true) {
                    try {
                        matrix1[i][j] = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a double number. Try again. ");
                        input.next();
                    }
                }
            }

        }
        System.out.println("Your first matrix is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Please enter the elements for your second matrix");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                while (true) {
                    try {
                        matrix2[i][j] = input.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a double number. Try again. ");
                        input.next();
                    }
                }
            }
        }

        System.out.println("Your second matrix is: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                resultMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("The result of element-wise matrix multiplication is:");
        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void textEncryptionDecryption(Scanner scanner) {
        boolean submenuActive = true;
        while (submenuActive) {
            System.out.println("\nText Encryption/Decryption.");
            System.out.println("Please select the operation:");
            System.out.println("[1] Encrypt Text");
            System.out.println("[2] Decrypt Text");
            System.out.println("[3] Return to the Main Menu");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    
                    System.out.print("Enter the shift value (-26 to 26): ");
                    int shiftEncrypt = getShiftValue(scanner);
                    if (shiftEncrypt != Integer.MIN_VALUE) {
                        System.out.print("Enter the text to encrypt: ");
                        String textToEncrypt = scanner.nextLine();
                        String encryptedText = encrypt(textToEncrypt, shiftEncrypt);
                        System.out.println("Encrypted Text: " + encryptedText);
                    }
                    break;
                case "2":
                    
                    System.out.print("Enter the shift value (-26 to 26): ");
                    int shiftDecrypt = getShiftValue(scanner);
                    if (shiftDecrypt != Integer.MIN_VALUE) {
                        System.out.print("Enter the text to decrypt: ");
                        String textToDecrypt = scanner.nextLine();
                        String decryptedText = decrypt(textToDecrypt, shiftDecrypt);
                        System.out.println("Decrypted Text: " + decryptedText);
                    }
                    break;
                case "3":
                    
                    submenuActive = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }


    public static String encrypt(String message, int shiftKey) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        String cipherText = "";
        
        for (int ii = 0; ii < message.length(); ii++) {
            char currentChar = message.charAt(ii);
            boolean isUpperCase = Character.isUpperCase(currentChar); 
            
        
            currentChar = Character.toLowerCase(currentChar);
            
            if (ALPHABET.indexOf(currentChar) != -1) { 
                int charPosition = ALPHABET.indexOf(currentChar);
                int keyVal = (shiftKey + charPosition) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal; 
                }
                char replaceVal = ALPHABET.charAt(keyVal);
                
            
                cipherText += isUpperCase ? Character.toUpperCase(replaceVal) : replaceVal;
            } else {
                cipherText += currentChar;
            }
        }
        return cipherText;
    }
    

    public static String decrypt(String cipherText, int shiftKey) {
        return encrypt(cipherText, -shiftKey);
    }


    public static int getShiftValue(Scanner scanner) {
        try {
            int shift = scanner.nextInt();
            scanner.nextLine(); 
            if (shift < -26 || shift > 26) {
                 System.out.println("Error: Please enter a valid integer shift value in the range [-26, 26].");

                return Integer.MIN_VALUE; 
            }
            return shift;
        } catch (Exception e) {
             System.out.println("Error: Please enter a valid integer shift value in the range [-26, 26].");

            scanner.nextLine(); 
            return Integer.MIN_VALUE;
        }
    }

    public static void ticTacToe() {
        System.out.println("Tic-Tac-Toe Game.");
    }

}

