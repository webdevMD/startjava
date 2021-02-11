public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Crimson Typhoon", "China", 250f, 8);
        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Japan", 280f, 7);
        System.out.println("modelName jaegerOne = " + jaegerOne.getModelName());
        System.out.println("modelName jaegerTwo = " + jaegerTwo.getModelName());
        System.out.println("jaegerOne made in = " + jaegerOne.getOrigin());
        System.out.println("jaegerTwo made in = " + jaegerTwo.getOrigin());
        System.out.println("height jaegerOne = " + jaegerOne.getHeight());
        jaegerOne.setHeight(270f);
        System.out.println("height jaegerOne = " + jaegerOne.getHeight());
        System.out.println("height jaegerTwo = " + jaegerTwo.getHeight());
        System.out.println("strength jaegerOne = " + jaegerOne.getStrength());
        jaegerOne.setStrength(10);
        System.out.println("modelName jaegerOne = " + jaegerOne.getStrength());
        System.out.println("strength jaegerTwo = " + jaegerTwo.getStrength());
        jaegerOne.piloting();
        System.out.println(jaegerTwo.piloting());
        jaegerOne.move();
        jaegerTwo.move();
        jaegerOne.scanKaiju();
        jaegerTwo.scanKaiju();
        jaegerOne.striking();
        jaegerTwo.striking();
    }
}
