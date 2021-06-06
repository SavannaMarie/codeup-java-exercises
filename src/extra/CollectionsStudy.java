package extra;

import java.util.ArrayList;

public class CollectionsStudy {

    // We'll start by defining an array list and adding some items to it
    ArrayList<String> roasts = new ArrayList<>();
roasts.add("light");
roasts.add("medium");
roasts.add("medium");
roasts.add("dark");

System.out.println(roasts); // [light, medium, medium, dark]

// using .contains
roasts.contains("dark"); // true
roasts.contains("espresso"); // false

// using .lastIndexOf
roasts.lastIndexOf("medium"); // 2

// using .isEmpty
roasts.isEmpty(); // false
    ArrayList<String> emptyList = new ArrayList<>();
emptyList.isEmpty(); // true

// .remove has two variants
roasts.remove("espresso"); // false
roasts.remove("medium"); // true
System.out.println(roasts); // [light, medium, dark]

roasts.remove(2); // "dark"
System.out.println(roasts); // [light, medium]


}
