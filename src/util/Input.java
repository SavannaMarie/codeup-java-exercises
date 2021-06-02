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
        return yesNo("Enter 'yes' or 'no' to find the boolean");
    }
    public boolean yesNo(String userBoolean){
        System.out.print(userBoolean);
        String input = this.scanner.nextLine();
        System.out.print("Your answer is boolean  ");
        return (input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes"));
    }





}
