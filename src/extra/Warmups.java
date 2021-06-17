package extra;

public class Warmups {
    // backAround
// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more.
    public String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }

    // or35
// Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
// Use the % "mod" operator.
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0)
            return true;
        return false;
    }

    // front22
// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    public String front22(String str) {
        if (str.length() < 2) {
            return str+str+str;
        }

        String front = str.substring(0,2);
        return front+str+front;
    }

    // startHi
// Given a string, return true if the string starts with "hi" and false otherwise.
    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;

        String start = str.substring(0,2);
        return start.equals("hi");
    }

    // icyHot
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }

    // in1020
// Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >=10 && b <=20));
    }

    // hasTeen
// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 3 int values, return true if 1 or more of them are teen.
    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19));
    }
}
