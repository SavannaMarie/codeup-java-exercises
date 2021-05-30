import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Your number was: %d%n", userNumber);
            return userNumber;
        }
    }
    public static long factorial(){
        long userNumber = getInteger(1, 10);
        long result = 1;
        for(int i = 1; i <= userNumber; i++){
            System.out.printf((result *= i) + ", ");
//            result *= i;
        }
        System.out.println("\nYour factorial is: " + result);
        System.out.println("Do you want to continue?");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        if(userAnswer.equalsIgnoreCase("yes")) {
            factorial();
        }
        return result;
    }
    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int diceSides = scanner.nextInt();
        int sides = (diceSides - 1) + 1;
        for (int i = 1; i <= 2; i++ ) {
            int rollresults = (int)(Math.random() * sides) + 1;
            System.out.printf("Roll number %d was %d.\n", i, rollresults);
        }
        System.out.println("Another roll?");
        String userAnswer = scanner.next();
        if(userAnswer.equalsIgnoreCase("yes")) {
            diceRoll();
        }
    }

    public static void main(String[] args) {
//        System.out.println(addition(2, 5));
//        System.out.println(subtraction(6, 3));
//        System.out.println(multiply(5, 5));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(20, 3));
//        System.out.println(getInteger(1, 20));
        factorial();
        diceRoll();
    }
}
