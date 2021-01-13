import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        int x = 8, y = 13;
        int sum = x + y;
        int difference = x - y;
        int productOfnumbers = x * y;
        int quotientOfDivision = x / y;
        long exponentiation = (long) Math.pow(x, y);
        int remainderOfTheDivision = x % y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Operator (+, -, *, /, ^, %) : ");
        char ch = scan.next().charAt(0);
        
        if (ch == '+') {
            System.out.println(sum);
        } else if (ch == '-') {
            System.out.println(difference);
        } else if (ch == '*') {
            System.out.println(productOfnumbers);
        } else if (ch == '/') {
            System.out.println(quotientOfDivision);
        } else if (ch == '^') {
            System.out.println(exponentiation);
        } else {
            System.out.println(remainderOfTheDivision);
        }
    }
}
