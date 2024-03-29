package com.startjava.Lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x = 8, y = 13;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Operator (+, -, *, /, ^, %) : ");
        char sign = scan.next().charAt(0);
        
        if (sign == '+') {
            System.out.println(x + y);
        } else if (sign == '-') {
            System.out.println(x - y);
        } else if (sign == '*') {
            System.out.println(x * y);
        } else if (sign == '/') {
            System.out.println(x / y);
        } else if (sign == '^') {
            long exp = 1;
            for (int i = 1; i <= y; i++) {
                exp *= (long) x;
            }
            System.out.println(exp);
        } else {
            System.out.println(x % y);
        }
    }
}
