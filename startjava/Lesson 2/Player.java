public class Player {
    private String name;
    int number;

    public Player(String name){
        this.name = name;
        //this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    public void guess() {
        number = (int) (Math.random() * 100);
        //System.out.println("игрок ввел число " + number);
    }
}