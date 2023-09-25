import java.util.Scanner;

public class Main { // class PartyAffiliation
    public static void main(String[] args) { // main()
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);

        // Display a menu and prompt the user for their choice
        System.out.println("Select your party affiliation:"); // output "Select your party affiliation (Democrat, republican, Independent):"
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        // Read the user's choice as a string
        String choice = in.nextLine(); // String Choice == ""
        // input Choice

        // Use of a cascaded if-else structure to determine the response
        if (choice.equalsIgnoreCase("D")) { //    if Choice == “D” then
            System.out.println("You get a Democratic Donkey."); // output “You get a Democratic Donkey.”
        } else if (choice.equalsIgnoreCase("R")) { // if Choice == "R" then
            System.out.println("You get a Republican Elephant."); // output " You get a Republican Elephant
        } else if (choice.equalsIgnoreCase("I")) { // if Choice == "I" then
            System.out.println("You get an Independent Person."); // output "You get an Independent Person"
        } else {
            System.out.println("You selected 'Other'.");// output "You selected other"

        } // end if
    } // return
} // endClass
