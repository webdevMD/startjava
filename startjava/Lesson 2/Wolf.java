public class Wolf {
    private boolean man;
    private String nickname, color;
    private int weight, age;

    public boolean isMan() {
        return man;
    }

    void setMan(boolean man) {
        this.man = man;
    }

    public String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void go() {

    }

    public void sit() {

    }

    public void run() {

    }

    public String howl() {
        return "Wooo-oo";
    }

    public boolean hunt() {
        System.out.println("well, hare, wait!");
        return true;
    }
}
