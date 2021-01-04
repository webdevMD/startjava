public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        float growth = 2.0f;
        boolean isMaleGender = true;
        char firstLetterOfName = 'A';

        if (age > 20) {
            System.out.println("Действуйте, Вам уже третий десяток!");
        }

        if (isMaleGender) {
            System.out.println("Умный и сильный");
        }

        if (!isMaleGender) {
            System.out.println("Зато красивая");
        }

        if (growth < 1.80) {
            System.out.println("Идеальный рост для женщины");
        }
        else {
            System.out.println("Идеальный рост для мужчины");
        }

        if (firstLetterOfName == 'M') {
            System.out.println("Тринадцатая буква в английском алфавите");
        }
        else if (firstLetterOfName == 'I') {
            System.out.println("Девятая буква в английском алфавите");
        }
        else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}