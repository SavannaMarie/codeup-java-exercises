package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return getString("Please enter a string");
    }
    public String getString(String inputString){
        System.out.println(inputString);
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        return yesNo("Enter 'yes' or 'no'");
    }
    public boolean yesNo(String userBoolean){
        System.out.print(userBoolean);
        String input = this.scanner.nextLine();
        return (input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes"));
    }
    public int getInt(){
        return this.scanner.nextInt();
    }
    public int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d%n", min, max);
        int userInput = scanner.nextInt();
        if((userInput < min) || (userInput > max)) {
            System.out.println("Please stay between the numbers. Try again!");
            return getInt(min, max);
        }
        return userInput;
    }
    public double getDouble(double min, double max) {
        System.out.printf("Give me a number between %f and %f\n", min, max);
        double userInput = this.scanner.nextDouble();
        if((userInput < min) || (userInput > max)) {
            System.err.println("Please stay between the numbers. Try again!");
            return getDouble(min, max);
        }
        return userInput;
    }
    public double getDouble(){
        return scanner.nextDouble();

    }

}
