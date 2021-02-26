import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
    String answerName1 = null;
    String answerName2 = null;
    System.out.println("what is your name playerOne? ");
    Player playerOne = new Player(answerName1);
    Scanner name = new Scanner(System.in);
    answerName1 = name.nextLine();
    playerOne.setName(answerName1);
    System.out.println("name playerOne = " + playerOne.getName());

    System.out.println("what is your name playerTwo? ");
    Player playerTwo = new Player(answerName2);
    answerName2 = name.nextLine();
    playerTwo.setName(answerName2);
    System.out.println("name playerTwo = " + playerTwo.getName());
    GuessNumber game = new GuessNumber();
    game.startGame();

    String[] option = new String[]{"no", "yes"};
    String answerProceed = "no";
    //public boolean proceed() {
        do {
            System.out.println("Хотите продолжить игру? [да/нет]:");
            //Scanner.nextLine();
            answerProceed = name.nextLine();
        } while (!option[0].equals(answerProceed) && !option[1].equals(answerProceed));
        if (option[0].equals(answerProceed)){
            answerProceed = "no";
            //break;
        }
        if (option[1].equals(answerProceed)) {
            game.startGame();
        }
        //return true;
        //}
    }
}
