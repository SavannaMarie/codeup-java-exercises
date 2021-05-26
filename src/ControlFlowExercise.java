import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {

        /*======While
            Create an integer variable i with a value of 5.
            Create a while loop that runs so long as i is less than or equal to 15
            Each loop iteration, output the current value of i, then increment i by one.
            Your output should look like this:
            5 6 7 8 9 10 11 12 13 14 15*/

//        int i = 5;
//        while (i <= 15){
//            System.out.print(i++ + " ");
//        }

        /*======Do While
            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
            Alter your loop to count backwards by 5's from 100 to -10.
            Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
             2
             4
             16
             256
             65536*/

//        int i = 2;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i  <= 1000000);


        /*Refactor the previous two exercises to use a for loop instead.*/

//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//        for (long x = 2; x <= 1000000; x *= x){
//            System.out.println(x);
//        }


        /*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
        program Starts:
        Please enter pin:
        22132
        Output:
        Incorrect, try again.
        Please enter pin:
        23412
        Output:
        Incorrect, try again.
        Please enter pin:
        12345
        Output:
        Correct, welcome back.
        */

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter pin: ");
//        final int pin = 12345;
//        for (int i = 1; i <= 3; i++) {
//            int attempt = scanner.nextInt();
//            if (attempt == pin) {
//                System.out.println("Correct, welcome back!");
//                break;
//            } else {
//                System.out.println("Incorrect, try again.");
//            } if (i == 3) {
//                System.out.print("Sorry but you have been locked out.");
//            }
//        }

        /*Display a table of powers.
        Prompt the user to enter an integer.
        Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to.*/

        boolean response = true;
        do{
            System.out.println("What number would you like to go up to?");
            int number = scanner.nextInt();
            System.out.println("number! | squared! | cubed!");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= number; i++) {
                System.out.printf("%-6d", i);
                System.out.print(" | ");
                System.out.printf("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.println("Would you like to enter a number?");
            String answer = scanner.next().toLowerCase();
            if(!answer.equals("yes")) {
                response = false;
            }
        } while (response);

        /*
        Convert given number grades into letter grades.
        Prompt the user for a numerical grade from 0 to 100.
        Display the corresponding letter grade.
        Prompt the user to continue.
        Assume that the user will enter valid integers for the grades.
        The application should only continue if the user agrees to.
        */

//            System.out.println("Would you like to find out your grade?");
//            String answer = scanner.next().toLowerCase();
//            if (answer.equals("yes")) {
//                System.out.println("Enter your grade 0-100");
//                int grade = scanner.nextInt();
//                if ((grade >= 88) && (grade <= 100)) {
//                    System.out.println("Your grade is an A!");
//                } else if ((grade >= 80) && (grade <= 87)) {
//                    System.out.println("Your grade is a B!");
//                } else if ((grade >= 67) && (grade <= 79)) {
//                    System.out.println("Your grade is a C!");
//                } else if (grade <= 59) {
//                    System.out.println("Your grade is a F!");
//                }
//            }
    }
}
