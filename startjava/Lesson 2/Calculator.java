public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;
    private String answer;

    public int getFirstNumber() {
        return firstNumber;
    }

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getSign() {
        return sign;
    }

    void setSign(char sign) {
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
                this.sign = sign;
        }
    }

    public String getAnswer() {
        return answer;
    }

    void setAnswer(String answer) {
        this.answer = answer;
    }
}
