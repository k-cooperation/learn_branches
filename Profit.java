import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("plz Enter the I number"    );
        double P = input.nextDouble();
        double B;
        B = 0.0;
        if(P <= 10){
            System.out.print(B = P * 0.1);
        } else if (P <= 20) {
            System.out.print(B = 0.1 * (P - 10) + 0.075 * P - (P - 10) );
        } else if (P <= 40) {
            System.out.print(B = 0.05 * (P - (P - 20)));
        } else if (P <= 60) {
            System.out.print(B = 0.03 * (P - (P - 40)));
        } else if (P < 100){
            System.out.print(B = 0.015 * (P -(P - 60)));
        } else if (P > 130)
            System.out.print(B = 0.01 * (P -(P - 100)));
    }
}
