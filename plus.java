import java.util.Scanner;
public class plus {
    public static void main(String[] args) {
        int number1=(int) (Math.random()*100);
        int number2=(int) (Math.random()*100);
        System.out.print("what is "+number1+"+"+number2+"?");
        Scanner input = new Scanner(System.in);
        int answer= input.nextInt();
        if (number1+number2 == answer)
            System.out.print("You are right");
        else
            System.out.print("Your answer is false!"+ number1 + number2 + "should be"+ (number1+number2));
    }
}
