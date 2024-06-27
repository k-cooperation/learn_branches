import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean guessed = false;

        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我已经选择了一个 1 到 100 之间的数字。");

        while (!guessed) {
            System.out.print("请输入你的猜测：");
            guess = input.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("太小了！再试一次。");
            } else if (guess > numberToGuess) {
                System.out.println("太大了！再试一次。");
            } else {
                System.out.println("恭喜你，猜中了！这个数字是 " + numberToGuess + "。");
                System.out.println("你总共猜了 " + numberOfTries + " 次。");
                guessed = true;
            }
        }


        input.close();
    }
}
