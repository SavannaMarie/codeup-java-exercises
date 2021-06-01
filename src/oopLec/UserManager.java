package oopLec;
import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User testUser = new User();
        testUser.username = "SavannaMarie";
        testUser.setPassword("password2");
        testUser.email = "savanna@gmail.com";
        System.out.println(testUser.getPassword());

        UserTools.login(testUser);

    }
}
