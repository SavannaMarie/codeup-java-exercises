import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f.%n", pi);

        Scanner newInteger = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int userInput = newInteger.nextInt();
        System.out.printf("Your number was %d.", userInput);


    }
}
