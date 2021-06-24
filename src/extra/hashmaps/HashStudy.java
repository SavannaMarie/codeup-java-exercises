package extra.hashmaps;

import java.util.HashMap;

public class HashStudy {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 3;
//        int c = 88;
//
//
//        HashMap<String, Integer> newHash = new HashMap<String, Integer>();
//        newHash.put("a", 10);
//        newHash.put("b", 3);
//        newHash.put("c", 88);
//
//        System.out.println(newHash);
//        System.out.println(newHash.get("c"));

        HashMap<String, String> hash2 = new HashMap<String, String>();
       hash2.put("Savanna", "savannaPassword123");
       hash2.put("Marky", "pawPatrolDude");
       hash2.put("Mark", "bestDadEver");

        System.out.println(hash2);
        System.out.println(hash2.containsValue("bestDadEver"));
        System.out.println(hash2.containsKey("Mark"));
        System.out.println(hash2.size());
        hash2.replace("Marky", "BabySharkDoDoDo");
        System.out.println(hash2);
        System.out.println(hash2.keySet());


    }
}
