import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数值");
        int number1 = input.nextInt();
        System.out.print("请输入第二个数值");
        int number2 = input.nextInt();
        int j = input.nextInt();
        System.out.print("the gcd of i"+ number1+ "j"+ number2 +"is "+ max(1,j));
    }
    public static int max(int number1,int number2){
        int i = 1;
        int j = 2;
        while(j <= number1&& i<= number2){
            if (number1 % j==0&& number2% j==0){
                j++;
            }
        }
        return max(2,j);
    }
}
