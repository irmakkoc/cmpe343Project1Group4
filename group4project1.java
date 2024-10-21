package cmpe343group4project1;
import java.util.Scanner;

public class group4project1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean working = true;
		while(working){
			printMenu();
			String choice = scanner.nextLine().toUpperCase();
			switch (choice){
			   case "A":
				statisticalInformation();
				break;
			   case "B":
				matrixOperations();
				break;
			   case "C":
				textEncryptionDecryption();
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



public static void printMenu(){

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
    }

    public static void textEncryptionDecryption() {
        System.out.println("Text Encryption/Decryption.");
    }

    public static void ticTacToe() {
        System.out.println("Tic-Tac-Toe Game.");
    }

}
