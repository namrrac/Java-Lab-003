import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // Declare the variables
        double f;

        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Prompt for American temp.
        System.out.print("What is the temperature in °F: ");
        f = scanner.nextInt();

        // Convert
        double c = (f - 32) * 5/9;


        // Print the variables
        System.out.println(f + "°F");
        System.out.printf("%.6f°C\n",c);
        System.out.printf("%.0f°C\n",c);
        //System.out.printf("If it were 2°C warmer it would be: " + (2 + c) + "°C");
        System.out.printf("If it were 2°C warmer it would be: %g°C", c+2);
    }
}
