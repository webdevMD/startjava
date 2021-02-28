import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answerName1 = null;
        String answerName2 = null;
        System.out.println("what is your name playerOne? ");
        
        Scanner inName = new Scanner(System.in);
        answerName1 = inName.nextLine();
        Player playerOne = new Player(answerName1);
        System.out.println("name playerOne = " + playerOne.getName());

        System.out.println("what is your name playerTwo? ");
        
        answerName2 = inName.nextLine();
        Player playerTwo = new Player(answerName2);
        System.out.println("name playerTwo = " + playerTwo.getName());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.start();

        String[] option = new String[]{"no", "yes"};
        String answerProceed = "no";

        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answerProceed = inName.nextLine();
            } while (!option[0].equals(answerProceed) && !option[1].equals(answerProceed));
            if (option[0].equals(answerProceed)){
                answerProceed = "no";
                break;
            }
        } while (true);
    }
}
