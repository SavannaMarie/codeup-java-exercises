import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f.%n", pi);

        Scanner newScanner = new Scanner(System.in);
//        System.out.println("Please enter a number.");
//        int userInput = newScanner.nextInt();
//        System.out.printf("Your number was %d.%n", userInput);
//
//        System.out.println("Please enter 3 words.");
//        String first = newScanner.next();
//        String second = newScanner.next();
//        String third = newScanner.next();
//        System.out.printf("Your 3 words were: %s, %s, and %s%n", first, second, third);
//
//        newScanner.nextLine();
//        System.out.println("Please enter a sentence:");
//        String sentence = newScanner.nextLine();
//        System.out.printf("your sentence was: %s", sentence);
//        newScanner.nextLine();
//
//
//        System.out.println("Please enter the length of the classroom: ");
//        String roomLength = newScanner.nextLine();
//        int newLength = Integer.parseInt(roomLength);
//        System.out.printf("Length entered was: %d", newLength);
//        System.out.println("Please enter the width of the classroom: ");
//        String roomWidth = newScanner.nextLine();
//        int newWidth = Integer.parseInt(roomWidth);
//        System.out.printf("Length entered was: %d", newWidth);
//        int perimeter = (newWidth * 2) + (newLength * 2);
//        int area = (newWidth * newLength);
//        System.out.printf("The perimeter is: %d, and the area is: %d.", perimeter, area);


        System.out.println("What is the length, width, and height of the room?");
        float width = newScanner.nextFloat();
        float length = newScanner.nextFloat();
        float height = newScanner.nextFloat();

        float area = width * length;
        float perimeter = (width * 2) + (length * 2);
        float volume = area * height;

        System.out.printf("The area is: %f%nThe perimeter is: %f%nThe volume is: %f%n", area, perimeter, volume);




    }
}
