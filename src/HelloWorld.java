public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        //=====Data Types
        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notaSmallNumber = 30000;

        int num = 45000000;

        long largeNumber = 14;
        System.out.println(largeNumber);

        float decimal = 1.5F;
        System.out.println(decimal);

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        char singleLetter = 'g';

        boolean amILearningJava = true;
        System.out.println(amILearningJava);

        String message = "How's it going? \nEverything alright? \n\tJava isn't that scary, is it?";
        System.out.println(message);

        final  char SINGLE_LETTER = 's';
        System.out.println(SINGLE_LETTER);

        //====Arithmatic
        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);
        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        //=====Casting (take a value and roll it over into a small precision)
        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = Long.MAX_VALUE;
        System.out.println(++iAmALong);
        //
        iAmAnInt = (int)iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble);

        iAmADouble = 3.141598;
        iAmAnInt = (int)iAmADouble;
        System.out.println(iAmAnInt);
    }
}













