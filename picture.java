import java.util.Scanner;

public class picture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入具体日期信息");
        System.out.print("年");
        int year = input.nextInt();
        System.out.print("月");
        int month = input.nextInt();
        System.out.print("日");
        int day = input.nextInt();
        int sum = 0, leap;
        switch (month) {
            case 2 -> sum = 31;
            case 3 -> sum = 59;
            case 4 -> sum = 90;
            case 5 -> sum = 120;
            case 6 -> sum = 151;
            case 7 -> sum = 181;
            case 8 -> sum = 212;
            case 9 -> sum = 243;
            case 10 -> sum = 273;
            case 11 -> sum = 304;
            case 12 -> sum = 334;
        }
        sum = sum + day;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leap = 1;
        } else {
            leap = 0;
        }
        if (leap == 1 && month > 2) {
            sum++;
        }
        System.out.println("the day input in currently in screen of this year is " + sum);
    }
}
