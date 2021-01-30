public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("Продолжить авторизацию");
        }

        boolean isMaleGender = true;
        if (isMaleGender) {
            System.out.println("Умный и сильный");
        }

        if (!isMaleGender) {
            System.out.println("Зато красивая");
        }

        float growth = 2.0f;
        if (growth < 1.80) {
            System.out.println("Идеальный рост для женщины");
        } else {
            System.out.println("Идеальный рост для мужчины");
        }

        char firstLetterOfName = 'A';
        if (firstLetterOfName == 'M') {
            System.out.println("Тринадцатая буква в английском алфавите");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Девятая буква в английском алфавите");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}