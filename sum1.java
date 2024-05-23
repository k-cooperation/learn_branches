import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数(如果他不为零的话)");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("请输入一个数(如果他不为零的话)");
            data = input.nextInt();
        }
        System.out.print("sum is" + sum);
    }
}
