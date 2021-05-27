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




    public static void main(String[] args) {
        System.out.println(addition(2, 5));
        System.out.println(subtraction(6, 3));
        System.out.println(multiply(5, 5));
        System.out.println(division(10, 2));
        System.out.println(modulus(20, 3));

    }
}
