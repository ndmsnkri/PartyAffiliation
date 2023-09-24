import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);

        // Display a menu and prompt the user for their choice
        System.out.println("Select your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        // Read the user's choice as a string
        String choice = in.nextLine();

        // Use of a cascaded if-else structure to determine the response
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent Person.");
        } else {
            System.out.println("You selected 'Other'.");
        }
    }
}
