package com.shubham.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human shubham = new Human(34, "shubham Kushwaha");
//        Human twin = new Human(shubham);

        Human twin = (Human)shubham.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(shubham.arr));
    }
}
