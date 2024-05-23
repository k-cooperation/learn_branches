import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入目标数值i");
        int i = input.nextInt();
        System.out.print("请输入目标数值j");
        int j = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (i >= k && j >= k) {
            if (i % k == 0 && j % k == 0) ;
            gcd = k;
            k++;
        }
        System.out.print("the GCD for i and j is " + gcd);
    }
}
