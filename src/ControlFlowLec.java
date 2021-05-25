import java.util.Scanner;

public class ControlFlowLec {
    public static void main(String[] args) {

//        int x = 5;
//        if (x == 5){
//            System.out.println("If you are reading this, it means x is 5");
//        }
//        System.out.println("on the other hand, this says nothing about x, because it runs regardless of what x is.");

//        int y = 2;
//        y = 3;
//        if (y == 2){
//            System.out.println("Carried out a conditional test. Can confirm true.");
//        } else {
//            System.out.println("I have tested to see if y=2 is true and it is false.");
//        }

//        short y = -5;
//        y = 12;
//        y = 32000;
//        if (y < 0){
//            System.out.println("The variable y contains a negative number value");
//        } else if (y >= 0 && y < 30000){
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variably y contains a numeric value that is dangerously close to the max value for short type variables. Which is: " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "strawberry";
//        switch (customerChoice){
//            case "vanilla":
//                System.out.println("One vanilla coming right up!");
//                break;
//            case "chocolate":
//                System.out.println("Chocolate coming right up");
//                break;
//            default:
//                System.out.println("Wo don't have that!");
//                break;
//        }

//        boolean existence = true;
//        if (existence){
//            System.out.println("The programmer is a real being");
//        }


        //======Logical operators ========//
//        int c = 0, d = 100, e = 50;
//
//
//        //short circuit operator
//        if (c == 1 && e++ < 100) {
//            //do something
//        }
//            System.out.println("e = " + e);
//        if (c == 0 && e++ < 100) {
//            //do something
//        }
//        System.out.println("e = " + e);
//
//
//        //non short circuit operator.
//        // & will always test both conditions,
//        // && will only test both if the first executes as true
//        if (c == 1 & e++ < 100){
//            //anything here
//        }
//        System.out.println("e = " + e);

//        String myName = "Savanna";

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//        if (userInput == myName){
//            System.out.println("Hello me!");
//        } else {
//            System.out.println("You are not me!");
//        }
//        if (userInput.equals(myName)){
//            System.out.println("Hello me!");
//        } else {
//            System.out.println("Not me!");
//        }


        //====Loops====//
        int i = 1;
        while (i < 10){
            System.out.println("Now i'm in the loop which has not incremented yet and it's value is " + i++);
        }

        //====Do While====//


    }
}








