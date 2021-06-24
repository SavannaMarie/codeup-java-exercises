package extra.hashmaps;

import java.util.HashMap;

public class HashStudy {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;


        HashMap<String, Integer> newHash = new HashMap<String, Integer>();
        newHash.put("a", 10);
        newHash.put("b", 3);
        newHash.put("c", 88);

        System.out.println(newHash);
        System.out.println(newHash.get("c"));
    }
}
