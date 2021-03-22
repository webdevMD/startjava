package com.startjava.Lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setMan(true);
        System.out.println("gender man = " + wolfOne.isMan());
        wolfOne.setNickname("Silver");
        System.out.println("nickname = " + wolfOne.getNickname());
        wolfOne.setWeight(23);
        System.out.println("weight = " + wolfOne.getWeight());
        wolfOne.setAge(9);
        System.out.println("age = " + wolfOne.getAge());
        wolfOne.setColor("gray");
        System.out.println("color = " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
