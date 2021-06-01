package oopLec;

public class User {
    public int id;
    public String username;
    private String password;
    public String email;

    public String getPassword() {
        return password;
    }
    public String setPassword(String password) {
        return this.password = password;
    }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;

    }
    public User() {};

    public static void main(String[] args) {
//        User testUser = new User();
//        testUser.username = "SavannaMarie";
//        testUser.password = "password";
//        testUser.email = "savanna@gmail.com";
//
//        System.out.println("UserName: " + testUser.username);
//        System.out.println("Password: " + testUser.password);
//        System.out.println("Email: " + testUser.email);


        User user2 = new User("Savanna2", "password2", "savanna2@gmail.com");
        System.out.println("UserName: " + user2.username);
        System.out.println("Password: " + user2.password);
        System.out.println("Email: " + user2.email);
    }
}
