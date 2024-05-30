import java.util.Scanner;

public class gorennpatu {
    public static void main(String[] args) {
        final int numberOfQuestions = 5;
        long start_time = System.currentTimeMillis();
        int count = 1;
        int correctSum = 0;
        String output = "";
        while (numberOfQuestions >= count) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is  " + number1 + " - " + number2 + "?");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the customers' number");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("you are right");
                correctSum++;
            } else if (number1 - number2 != answer) {
                System.out.println("you got the wrong result");
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long uesTime = endTime - start_time;
        System.out.println("the correct sum is " + correctSum + "and the useTime is " + uesTime);
    }
}
