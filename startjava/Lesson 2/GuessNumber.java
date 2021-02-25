import java.lang.Math;
import GuessNumberTest.proceed;

public class GuessNumber {
    
    Player playerOne;
    Player playerTwo;

    public void startGame() {
        int optionFirstPlayer = 0;
        int optionSecondPlayer = 0;
        boolean optionFirstRight = false;
        boolean optionSecondRight = false;
        int targetNumber = (int) (Math.random() * 100);
        
        while (true) {
            System.out.println("комп загадал " + targetNumber);
            playerOne.guess();
            playerTwo.guess();

            optionFirstPlayer = playerOne.number;
            System.out.println("первый игрок думает, что это " + optionFirstPlayer);
            if (optionFirstPlayer < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (optionFirstPlayer > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }

            optionSecondPlayer = playerTwo.number;
            System.out.println("второй игрок думает, что это " + optionSecondPlayer);
            if (optionSecondPlayer < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (optionSecondPlayer > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }

            if (optionFirstPlayer == targetNumber) {
                optionFirstRight = true;
            }
            if (optionSecondPlayer == targetNumber) {
                optionSecondRight = true;
            }

            if (optionFirstRight || optionSecondRight) {
                System.out.println("Первый игрок угадал?" + optionFirstRight);
                System.out.println("Второй игрок угадал?" + optionSecondRight);
                
                break;
            } else { 
                playerOne.proceed();
            }
        
        }
    }
    
}