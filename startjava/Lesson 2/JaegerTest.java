public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        jaegerOne.setModelName("Crimson Typhoon");
        System.out.println("modelName jaegerOne = " + jaegerOne.getModelName());
        jaegerTwo.setModelName("Coyote Tango");
        System.out.println("modelName jaegerTwo = " + jaegerTwo.getModelName());
        jaegerOne.setOrigin("China");
        System.out.println("modelName jaegerOne = " + jaegerOne.getOrigin());
        jaegerTwo.setOrigin("Japan");
        System.out.println("modelName jaegerTwo = " + jaegerTwo.getOrigin());
        jaegerOne.setHeight(250f);
        System.out.println("modelName jaegerOne = " + jaegerOne.getHeight());
        jaegerOne.setHeight(300f);
        System.out.println("modelName jaegerOne = " + jaegerOne.getHeight());
        jaegerTwo.setHeight(280f);
        System.out.println("modelName jaegerTwo = " + jaegerTwo.getHeight());
        jaegerOne.setStrength(8);
        System.out.println("modelName jaegerOne = " + jaegerOne.getStrength());
        jaegerOne.setStrength(10);
        System.out.println("modelName jaegerOne = " + jaegerOne.getStrength());
        jaegerTwo.setStrength(7);
        System.out.println("modelName jaegerTwo = " + jaegerTwo.getStrength());
        jaegerOne.pilots();
        System.out.println(jaegerTwo.pilots());
        jaegerOne.move();
        jaegerTwo.move();
        jaegerOne.scanKaiju();
        jaegerTwo.scanKaiju();
        jaegerOne.bodyLanguage();
        jaegerTwo.bodyLanguage();
    }
}