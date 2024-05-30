import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score belonging to student ");
        double score = input.nextDouble();
        int k = grade(score);
        System.out.print("the grade of this student is " + k);
    }

    public static char grade(double score) {
        if (score > 90) {
            System.out.print('A');
        } else if (score > 80) {
            System.out.print('B');
        } else if (score > 70) {
            System.out.print('C');
        } else if (score > 60) {
            System.out.print('D');
        }
        if (score > 60) {
            System.out.print('D');
        }
        return 0;
    }
}
