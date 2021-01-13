import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x = 8, y = 13;
        long exponentiation = 1;
        for (long i = 1; i <= (long)y; i++) {
        exponentiation = exponentiation * (long)x;
        }

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
            System.out.println(exponentiation);
        } else {
            System.out.println(x % y);
        }
    }
}
