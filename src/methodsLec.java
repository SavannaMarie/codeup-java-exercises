public class methodsLec {

    public static void  sayHello() {
        System.out.println("Can't talk right now");
    }
    public static void  sayHello(String salutation, String name) {
        System.out.printf("%s There! my name is %s! Have a great day!%n", salutation, name);
    }

    public static void sayHello(int times) {
        for (int i = 1; i <= times; i++){
            System.out.println("Hello, darling!");
        }
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }


    public static void main(String[] args) {
        sayHello();
        sayHello("Howdy", "Savanna");
        sayHello(4);
        System.out.println(multiply(5, 2));

        int product = multiply(7,3);
        System.out.printf("Did you know that %d X %d ='s %d?", product, product, product * product);



    }
}
