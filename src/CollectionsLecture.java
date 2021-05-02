import shapes.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(32);
        collectionOfNums.add(32);
        collectionOfNums.add(1, 24);

        collectionOfNums.forEach(System.out::println);

        System.out.println("=======HashMaps========");
        HashMap<Character, Square> squares = new HashMap<>();
        squares.put('A', new Square(5));
        System.out.println(squares.get('A').getArea());
    }
}
