package oopLec;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);

    public static void login(User user) {
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();
        if(userPassword.equals(user.getPassword())){
            System.out.println("You have successfully loged in!");
        } else {
            System.out.println("That password is incorrect");
        }

    }

    public static void main(String[] args) {
        User testUser = new User();
        testUser.username = "SavannaMarie";
        testUser.setPassword("password");
        testUser.email = "savanna@gmail.com";
        System.out.println(testUser.getPassword());

        UserTools.login(testUser);


        User user2 = new User("Savanna2", "password2", "savanna2@gmail.com");
        System.out.println("UserName: " + user2.username);
        System.out.println("Password: " + user2.getPassword());
        System.out.println("Email: " + user2.email);
    }
}
