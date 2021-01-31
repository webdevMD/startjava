public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.man = true;
        System.out.println("gender man = " + wolfOne.man);
        wolfOne.nickname = "Silver";
        System.out.println("nickname = " + wolfOne.nickname);
        wolfOne.weight = 23;
        System.out.println("weight = " + wolfOne.weight);
        wolfOne.age = 5;
        System.out.println("age = " + wolfOne.age);
        wolfOne.color = "gray";
        System.out.println("color = " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
