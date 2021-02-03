public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    public void consider() {
        switch(sign) {
            case '+' :
                System.out.println(firstNumber + secondNumber);
                break;
            case '-' :
                System.out.println(firstNumber - secondNumber);
                break;
            case '*' :
                System.out.println(firstNumber * secondNumber);
                break;
            case '/' :
                System.out.println(firstNumber / secondNumber);
                break;
            case '^' :
                long exp = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    exp *= (long) firstNumber;
                }
                System.out.println(exp);
                break;
            case '%' :
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("unknown function");
        }
    }
}
