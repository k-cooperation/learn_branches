import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int systemNumber = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");

        int guessNumber =-1;
        while (guessNumber != systemNumber) {
            System.out.print("\nEnter the guessNumber ");
            guessNumber = input.nextInt();

            if (guessNumber == systemNumber) {
                System.out.print("the number is " + guessNumber);
            } else if (guessNumber > systemNumber) {
                System.out.print("your guessNumber is too high");
            } else {
                System.out.print("your guessNumber is too low ");
            }
        }
    }
}
