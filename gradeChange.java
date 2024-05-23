import java.util.Scanner;

public class gradeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入目标成绩(如果该成绩符合常规的话)");
        double score = input.nextDouble();
        while (score != 0) {
            System.out.println(" the getGrade is " + getGrade(score));
            System.out.print("输入目标成绩(如果该成绩符合常规的话)");
            score = input.nextDouble();
        }
    }

    public static char getGrade(double score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 60) {
            return 'D';
        } else if (score < 60) {
            return 'E';
        }
        return getGrade(score);
    }
}