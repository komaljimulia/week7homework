package Homework;

import java.util.Locale;

public class Homework21 {
    public static void main(String[] args) {
        String name1="This is first string";
        String name2="This is second string";
        System.out.println("Length: " + name1.length());
        System.out.println("charAt (2): " +name1.charAt(2));
        System.out.println("Concat: " +name1.concat(name2));
        System.out.println("Contains: " + name1.contains("first"));
        System.out.println("startWith: " + name1.startsWith("s"));
        System.out.println("endsWith: " +name1.endsWith("G"));
        System.out.println("Equals: " +name1.equals(name2));
        System.out.println("indexOf(t): " +name1.indexOf("t"));
        System.out.println("isEmpty: " +name2.isEmpty());
        System.out.println("replace(This, That): " +name2.replace("This", "That"));
        System.out.println("substring(5,7): " +name1.substring(5,7));
        System.out.println("charArray: " + name1.toCharArray());
        System.out.println("toLoverCase: " +name1.toLowerCase());
        System.out.println("toUpperCAse: " +name1.toUpperCase());
        System.out.println("Trim: " +name1.trim());
    }
}
