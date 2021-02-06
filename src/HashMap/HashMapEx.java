package HashMap;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 3;
//        int c = 88;
//        // Hashmap can store the variables
//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a", 10);
//        happy.put("b", 3);
//        happy.put("c", 88);
//        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobby", "Fluffy"); // keys on left; values on right
        fun.put("hello", "aloe");
        fun.put("random", "yoyoyo");

        fun.remove("hello");

        System.out.println(fun.containsValue("yoyoyo"));
    }
}