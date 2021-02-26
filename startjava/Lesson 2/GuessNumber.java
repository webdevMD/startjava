import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    boolean numberOneRight = false;
    boolean numberTwoRight = false;

    int answerNumber1 = 0;
    int answerNumber2 = 0;

    public void startGame() {
    int targetNumber = (int) (Math.random() * 100);
    System.out.println("комп загадал " + targetNumber);

    System.out.println("playerOne введите число: ");
    Scanner number = new Scanner(System.in);
    int answerNumber1 = number.nextInt();
    playerOne.setNumber(answerNumber1);
    System.out.println("number playerOne = " + playerOne.getNumber());
        if (answerNumber1 < targetNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (answerNumber1 > targetNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }

    System.out.println("playerTwo введите число: ");
    int answerNumber2 = number.nextInt();
    playerTwo.setNumber(answerNumber2);
    System.out.println("number playerTwo = " + playerTwo.getNumber());
        if (answerNumber2 < targetNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (answerNumber2 > targetNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }

        if (answerNumber1 == targetNumber) {
            numberOneRight = true;
        }
        if (answerNumber2 == targetNumber) {
            numberTwoRight = true;
        }

        if (numberOneRight || numberTwoRight) {
            System.out.println("Первый игрок угадал?" + numberOneRight);
            System.out.println("Второй игрок угадал?" + numberTwoRight);
            //break;
        }
    }
}
