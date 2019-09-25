public class Difference {
    public static void main(String[] args)
    {
        int num1 = 87;
        int num2 = 99;

        System.out.printf("%d - %d = %d", num1, num2, difference(num1, num2));
    }

    /**
     * This method will return the difference between the first and second integer
     * as an integer
     */
    public static int difference(int num1, int num2)
    {
        return num1-num2;
    }
}
