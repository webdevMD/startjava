import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answerName1;
        String answerName2;
        GuessNumber game = new GuessNumber();
        Player playerOne = new Player("answerName1");
        Player playerTwo = new Player("answerName2");
        System.out.println("what is your name playerOne? ");
        Scanner scanner = new Scanner(System.in);
        //scanner.nextLine();
        answerName1 = scanner.nextLine();
        System.out.println("ответил playerOne имя " + answerName1);
        System.out.println("what is your name playerTwo? ");
        answerName2 = scanner.nextLine();
        System.out.println("ответил playerTwo имя " + answerName2);

        String[] option = new String[]{"no", "yes"};
        String answerProceed = "no";

        public boolean proceed() {
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                Scanner.nextLine();
                answerProceed = scanner.nextLine();
            } while (!option[0].equals(answerProceed) && !option[1].equals(answerProceed));
            if (option[0].equals(answerProceed)){
                answerProceed = "no";
                break;
            }
            return true;
        }

        game.startGame();
    }
}