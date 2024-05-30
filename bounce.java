
import java.util.Scanner;

public class bounce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        if (i <= 10) {
            System.out.println("the profit is " + i * 0.01);
        } else if (i > 10 && i < 20) {
            System.out.println("the profit is " + (i - 10) * 0.01 + (10 - (20 - i)) * 0.075);
        } else if (i > 20 && i < 40) {
            System.out.println("the profit is " + (20 - i) * 0.05);
        } else if (i > 40 && i < 60) {
            System.out.println("the profit is " + (20 - i) * 0.03);
        } else if (i > 60 && i < 100) {
            System.out.println("the profit is " + (40 - i) * 0.015);
        } else if (i > 100) {
            System.out.println("the profit is " + (i - 100) * 0.03);
        }
    }
}
