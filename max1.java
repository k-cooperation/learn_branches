import java.util.Scanner;

public class max1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print(" 请输入第一个目标值");
        number1 = input.nextInt();
        System.out.print(" 请输入第二个目标值");
        number2 = input.nextInt();
        int k = max(number1, number2);
        System.out.print("the greatest number between number1 and number2  is  " + k);
    }

    public static int max(int number1, int number2) {
        int result;
        if (number1 > number2) result = number1;
        else result = number2;
        return result;
    }
}
