import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean consider = true;

        
        while (consider) {
            Calculator calculatorOne = new Calculator();
            calculatorOne.setFirstNumber(2);
            System.out.println("Введите первое число: " + calculatorOne.getFirstNumber());
            System.out.print("Введите знак математической операции: ");
            Scanner operation = new Scanner(System.in);
            char sign = operation.next().charAt(0);
            calculatorOne.setSecondNumber(10);
            System.out.println("Введите второе число: " + calculatorOne.getSecondNumber());
            calculatorOne.setSign(sign);
            System.out.println("Хотите продолжить вычисления? [да/нет]: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            calculatorOne.setAnswer(answer);
                if (answer == "да") {
                    consider = true;
                } else {
                    consider = false;
                }
        }
    }
}