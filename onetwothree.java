import java.security.Key;

public class onetwothree {
    public static void main(String[] args) {
        int sum = 0;
        int i, k, l;
        for (i = 1; i < 5; i++) {
            for (k = 1; k < 5; k++) {
                for (l = 1; l < 5; l++) {
                    if (i != k && k != l && i != l) {
                        System.out.println(i * 100 + k * 10 + l);
                        sum++;
                    }
                }
            }
        }
        System.out.print("the amount of all can be spelled by just 1.2.3.4 is" + sum);
    }
}
