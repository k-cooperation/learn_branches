import java.util.Scanner;

public class rojikku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数值");
        int num = input.nextInt();
        if (num / 5 == 0 && num / 6 == 0) {
            System.out.println("Is 10 divisible by 5 and 6 ?" + "ture");
        } else {
            System.out.println("false");

        }
        if (num / 5 == 0 || num / 6 == 0) {
            System.out.println("Is 10 divisible by 5 or 6 ?" + "ture");
        } else {
            System.out.println("false");

        }
        if (num / 5 == 0 ^ num / 6 == 0) {
            System.out.println("Is 10 divisible by 5 or 6,but not both ?" + "ture");
        } else {
            System.out.println("false");

        }
    }
}
