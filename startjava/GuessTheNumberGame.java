import java.lang.Math;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадывает число от 0 до 100");
        
        for (int i = 0; i <= 100; i++) {
            System.out.println("Игрок выбрал число " + i);
            if (i < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (i > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
            System.out.println("Вы угадали!");
            break;
            }
        }
    }
}