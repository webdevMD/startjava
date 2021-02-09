public class Jaeger {
    private String modelName;
    private String origin;
    private float height;
    private int strength;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean pilots() {
        System.out.println("Вами управляют пилоты");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void bodyLanguage() {
        System.out.println("Вы нанесли 5 ударов");
    }
}