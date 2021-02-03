import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        String option1 = "yes";
        String option2 = "no";
        boolean right1 = false;
        boolean right2 = false;

        Calculator calculator = new Calculator();
        System.out.print("vvedi");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        calculator.setFirstNumber(firstNumber);
        System.out.print("vvedi ");
        char sign = scanner.next().charAt(0);
        calculator.setSign(sign);
        System.out.print("vvedi ");
        int secondNumber = scanner.nextInt();
        calculator.setSecondNumber(secondNumber);
        calculator.consider();
        while (true) {
            System.out.println("vvedi ");
            answer = scanner.nextline();
            if (answer == option1) {
                right1 = false;
            }
            if (answer == option2) {
                right1 = false;
            } else {
                System.out.println("vvedi ");
            }
        }
    }
}
