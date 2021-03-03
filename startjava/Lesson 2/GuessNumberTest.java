import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("what is your name playerOne? ");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        Player playerOne = new Player(name1);
        System.out.println("name playerOne = " + playerOne.getName());
        System.out.println("what is your name playerTwo? ");
        String name2 = scan.nextLine();
        Player playerTwo = new Player(name2);
        System.out.println("name playerTwo = " + playerTwo.getName());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String[] option = new String[]{"no", "yes"};
        String answerProceed = "no";

        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answerProceed = scan.nextLine();
            } while (!option[0].equals(answerProceed) && !option[1].equals(answerProceed));
        } while (option[1].equals(answerProceed));
    }
}
