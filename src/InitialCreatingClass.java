import java.util.Scanner;

public class InitialCreatingClass {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        String firstName = keyboard.nextLine();

        System.out.printf("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.printf("Your initials are %s%n", getInitials(firstName,lastName));
    }

    /**
     * This method will receive a first and last name as String objects
     * and return the first letter in each name separated by . as a String
     */
    public static String getInitials(String first, String last)
    {
        char firstInitial = first.charAt(0);
        char secondInitial = last.charAt(0);

        return firstInitial + "." + secondInitial + ".";
    }
}
