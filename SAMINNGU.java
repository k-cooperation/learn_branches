import java.util.Scanner;

public class SAMINNGU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of minutes  ");
        int number = input.nextInt();
        if (number < 100) {
            int plus = number / 10 + number % 10;
            System.out.println("when a number chosen from 0 ~ 1000 the plus of element part is " + plus);
        } else if (number < 1000) {
            int plus = number / 100 + (number / 10 ) % 10 + number % 10;
            System.out.println("when a number chosen from 0 ~ 1000 the plus of element part is " + plus);
        }
    }
}
