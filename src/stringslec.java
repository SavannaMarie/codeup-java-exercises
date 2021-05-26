import java.util.Scanner;

public class stringslec {
    public static void main(String[] args) {
//        char character = 'd';
//        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
//        String bob = "uncle Bob";
//        String maybeBob = scanner.nextLine();
////        System.out.println(bob == maybeBob);
//
//        System.out.println("User answered with correct and capitalization: " + bob.equals(maybeBob));
//        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));

        //Compare the start and end of strings
        String savanna = "Savanna";
        String you = "You";
        String firstLetterSavanna = "" + savanna.charAt(0);
        System.out.println("Savanna and you start with the same letter? " + you.startsWith(firstLetterSavanna));
        System.out.print("Does Savanna end with an a? ");
        System.out.println(savanna.endsWith("a"));

        //Maniputlation
        System.out.print("What is the index of va in Savanna? ");
        int locationofAInSavanna = savanna.indexOf("va");
        System.out.println(locationofAInSavanna);

        int savannaLength = savanna.length();
        System.out.println("The length of savanna is: " + savannaLength);

        String hello = "Hello Savanna! How are you?";
        String helloSub = hello.substring(6, 14);
        System.out.println("This is a substring: " + helloSub);

        hello = hello.replace(helloSub, you + ",");
        System.out.println(hello);





    }
}
