import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        while (true) {
            boolean numberOneRight = false;
            boolean numberTwoRight = false;
            int x = 1;
            int y = 100;
            int targetNumber = ThreadLocalRandom.current().nextInt(x,y);
            System.out.println("комп загадал " + targetNumber);
            System.out.println("playerOne введите число: ");
            Scanner scan = new Scanner(System.in);
            int number1 = scan.nextInt();
            playerOne.setNumber(number1);
            System.out.println("number1player = " + playerOne.getNumber());
        
            if (number1 < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (number1 > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
            if (number1 == targetNumber) {
                numberOneRight = true;
                System.out.println("Первый игрок угадал?" + numberOneRight);
            }

            System.out.println("playerTwo введите число: ");
            int number2 = scan.nextInt();
            playerTwo.setNumber(number2);
            System.out.println("number2player = " + playerTwo.getNumber());
        
            if (number2 < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (number2 > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
            if (number2 == targetNumber) {
                numberTwoRight = true;
                System.out.println("Второй игрок угадал?" + numberTwoRight);
            }
            if (numberOneRight || numberTwoRight) {
                System.out.println("Есть победитель! Конец игры");
                break;
            } else {
            System.out.println("Игроки должны попробовать еще раз");
            }
        }
    }
}
