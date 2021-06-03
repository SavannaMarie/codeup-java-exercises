import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {
        int[] numbers = {14, 33,  34, 44};
        for (int element: numbers) {
            System.out.println(element);
        }
        String[] topFiveBoyNames = new String[6];
        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Marky";
        topFiveBoyNames[3] = "Mark";
        topFiveBoyNames[4] = "Killer";

        for (String name : topFiveBoyNames){
            System.out.println(name);
        }
        boolean[] lookingAtDefaultVals = new boolean[3];
        for(boolean boo : lookingAtDefaultVals){
            System.out.println(boo);
        }
        Arrays.fill(lookingAtDefaultVals, true);
        for (boolean boo : lookingAtDefaultVals){
            System.out.println(boo);
        }
        int[] alsoNums = {14, 33, 34, 44};
        System.out.println(numbers == alsoNums);
        for (int number : numbers){
            System.out.println(number);
        }

        int[]  unsortedNightmare = {99, -19, 99, 0, 3, 44, 13};
        Arrays.sort(unsortedNightmare);
        System.out.println(Arrays.toString(unsortedNightmare));

        char [][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        for (char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }
}








