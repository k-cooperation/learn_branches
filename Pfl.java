import java.util.Scanner;

public class Pfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的score");
        int score = scanner.nextInt();
        if (score>=90 && score<=100){
            System.out.println("Thank you A");
        }else if (score>=80 && score<=89){
            System.out.println("Keep going B");
        }else if (score>=70 && score<=79){
            System.out.println("needs improvement C");
        }else if (score>=60 && score>=69){
            System.out.println("got a passing mark");

        }else {
            System.out.println("you stuppid jerk \uD83D\uDE21");
        }
    }
}
