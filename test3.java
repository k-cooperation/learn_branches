import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        final int numberOfQuestions = 5;
        int correctCount =  0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        while(count < numberOfQuestions){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
        int num = input.nextInt();
        System.out.print("将number1和number2作差" + number1+ "-" + number2 + "得到 num " + num);
            num = number1 - number2;


        }
    }
}
