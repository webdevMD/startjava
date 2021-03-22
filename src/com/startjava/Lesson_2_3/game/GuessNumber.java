package com.startjava.Lesson_2_3.game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        int x = 1;
        int y = 100;
        int targetNumber = ThreadLocalRandom.current().nextInt(x,y);
        System.out.println("комп загадал " + targetNumber);
        while (true) {
            System.out.println(playerOne.getName() + " введите число: ");
            int number1 = scan.nextInt();
            playerOne.setNumber(number1);
            if (number1 < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (number1 > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println(playerOne.getName() + " угадал!");
                break;
            }

            System.out.println(playerTwo.getName() + " введите число: ");
            int number2 = scan.nextInt();
            playerTwo.setNumber(number2);
            if (number2 < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (number2 > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println(playerTwo.getName() + " угадал!");
                break;
            }
        }
    }
}
