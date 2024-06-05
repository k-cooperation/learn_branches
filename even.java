public class even {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        for (n = 2; n <= 100;n+=1) {
            if (n % 2 == 0)
             sum = (int) (0.5 * n * (2 + n));
        }
        System.out.println("all the even plus from 1 to 100 is " + sum);
    }
}
