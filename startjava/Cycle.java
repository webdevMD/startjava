public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        int n = 6;
        while (n >= -6) {
            System.out.println(n);
            n -= 2;
        }

        int z = 10;
        int sum = 0;
        do {
            z++;
            if (z % 2 != 0) {
                sum += z;
            }
        } while (z < 20);
        System.out.println(sum);
    }
}

