import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce yourself to Bob!");
        System.out.println("When you are done with Bob just say: \n\"I'm done with you\".");

        boolean finished = false;
        do {
            String userInput = scanner.nextLine().trim();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Fine! be that way!");
            } else if (userInput.equalsIgnoreCase("I'm done with you")) {
                System.out.println("Ugh! I'm so over this!");
                finished = true;
            } else {
                System.out.println("Whatever.");
            }
        } while(finished == false);




    }
}
