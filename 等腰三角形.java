public class 等腰三角形 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
