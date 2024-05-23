import java.util.Scanner;

public class cyclePlus {
    public static void main(String[] args) {
        final int numberOfQuestions = 5;
        String output = " ";
        System.out.print("All these questions answer taken time is " + time());
        System.out.println("All the right answer amount is " + judge());
    }

    public static boolean judge() {
        int count = 0;
        int number1 = (int) (Math.random() * 17);
        int number2 = (int) (Math.random() * 17);
        System.out.println("the two letter born by system plus is " + number1 + number2);
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 + number2 == answer) {
            System.out.println("you are correct");
            int correct = 0;
            correct++;
        } else {
            System.out.println("you answer is wrong.\n" + number1 + number2 + "should be" + number1 + number2);
            count++;
        }
        return false;
    }

    public static long time() {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        return testTime;
    }
}
