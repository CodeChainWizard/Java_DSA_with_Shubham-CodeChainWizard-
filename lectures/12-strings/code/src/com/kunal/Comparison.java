package com.shubham;

public class Comparison {
    public static void main(String[] args) {
        String a = "shubham";
        String b = "shubham";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("shubham");
        String name2 = new String("shubham");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
