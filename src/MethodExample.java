import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args)
    {
        //object and class names are nouns and start with Upper case letters
        Scanner keyboard = new Scanner(System.in);

        //method names usually contain some type of verb or action and start
        //with lower case letters
        printingWithNoArguments();

        printingWithArguments("Hello", 5);
    }

    /**
     * The return type is void meaning the method returns nothing
     * This method is called "printingWithNoArguments".
     * Arguments are objects passed into a method.
     */
    public static void printingWithNoArguments()
    {
        System.out.printf("Print statement from method 'printingWithNoArguments'%n");
    }

    /**
     * This method will receive arguments and display them to the screen
     */
    public static void printingWithArguments(String message, int timesToRepeat)
    {
        int counter = 1;
        while (counter <= timesToRepeat )
        {
            System.out.printf("inside 'printingWithArguments' the message is: %s%n", message);
            counter = counter + 1;
        }
    }

}
