import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a = input.nextInt();
        int b = a / 100;
        int c = (a / 10) % 10;
        int d = a % 10;
        if (2 * c == (b + d)) {
            System.out.print("a是回味数");
        }
    }
}
