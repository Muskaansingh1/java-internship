package com.company;

public class reverseString {
    public static void main(String[] args) {
        String string = "Dream big";
        //Stores the reverse of given string
        String reversedStr = "";

        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}

