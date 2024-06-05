public class hundred {
    public static void main(String[] args) {
        int product = 1;
        int i;
        for (i = 1; i <= 10; i++) {
            product = (int) Math.pow(i, 2);
            System.out.println("the ^2 function of " + i + " is " + product);
        }
    }
}
