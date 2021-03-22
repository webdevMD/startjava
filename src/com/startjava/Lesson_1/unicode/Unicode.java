package com.startjava.Lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 9398; i <= 10178; i++) {
            char[] symbol = Integer.toString(i).toCharArray();
            System.out.println(symbol);
        }
    }
}