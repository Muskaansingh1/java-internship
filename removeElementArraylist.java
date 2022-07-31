package com.company;

import java.util.ArrayList;

public class removeElementArraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);
        arr.add("muskan");
        arr.add("singh");
        arr.add("abc");
        arr.add("xyz");
        System.out.println("The list of the size is: " + arr.size());
        // Showing all the elements in the ArrayList
        for (String name : arr) {
            System.out.println("Name is: " + name);
        }
        // Removing element available at position 1
        arr.remove(1);
        System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());
        for (String name : arr) {
            System.out.println("Name is: " + name);

        }
    }
}
