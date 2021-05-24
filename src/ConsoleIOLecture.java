import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World! 23");

        String name = "Savanna";
        System.out.printf("Hello, %s%n", name);
        //===== %d stands for decimal %s stands for String %b stands for boolean
        System.out.format("%d is %s's favorite number \n", 42, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, how's it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Give me a number: ");
        int num = scanner.nextInt();

        System.out.printf("Your number is: %d%n", num);
    }
}
