import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String[] option = new String[]{"no", "yes"};
        boolean right = true;

        Calculator calculator = new Calculator();
        while (right) {
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
            calculator.calculate();
            while (true) {
                System.out.println("Хотите продолжить вычисления? [no/yes]: ");
                String answer = scanner.nextLine();
                if (option[0].equals(answer)){
                    right = false;
                    break;
                }
                if (option[1].equals(answer)){
                    right = true;
                    break;
                }
            }
        }
    }
}
