import java.util.Scanner;

public class CalculatorTestotkat {
    public static void main(String[] args) {
        boolean proceed = true;
        String answer;
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        calculator.setFirstNumber(firstNumber);
        System.out.print("Введите знак математической операции: ");
        char sign = scanner.next().charAt(0);
        calculator.setSign(sign);
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        calculator.setSecondNumber(secondNumber);
        calculator.consider();
        do {
            System.out.println("Хотите продолжить вычисления? [да/нет]: ");
            answer = scanner.nextline();
        } while (answer != "да"|| answer != "нет");
    }
}
