import java.util.Scanner;

public class zeddai {
    public static void main(String[] args) {
        System.out.println("请输入目标数值");
        int input = new Scanner(System.in).nextInt();
        if (input >= 0) {
            System.out.println(input);
        } else {
            System.out.println(0 - input);
        }
    }
}
