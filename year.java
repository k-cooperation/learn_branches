import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the month");
        int month = input.nextInt();
        if ((year / 4 == 0) && (year / 100 != 0)||(year / 400 == 0)) {
            System.out.println("this year is a leap year");
            switch (month) {
                case 1 -> System.out.print("the Jan " + "has 31 days");
                case 2 -> System.out.print("the Feb " + "has 28 days");
                case 3 -> System.out.print("the Wnd " + "has 31 days");
                case 4 -> System.out.print("the Apr " + "has 30 days");
                case 5 -> System.out.print("the May " + "has 31 days");
                case 6 -> System.out.print("the Jun " + "has 30 days");
                case 7 -> System.out.print("the Jul " + "has 31 days");
                case 8 -> System.out.print("the Aug " + "has 31 days");
                case 9 -> System.out.print("the Sep " + "has 30 days");
                case 10 -> System.out.print("the Oct " + "has 31 days");
                case 11 -> System.out.print("the Dec " + "has 30 days");
                case 12 -> System.out.print("the Nov " + "has 31 days");
            }
        }
        if ((year / 4 != 0) && (year / 100 == 0)||(year / 400 != 0)) {
            switch (month) {
                case 1 -> System.out.print("the Jan " + "has 31 days");
                case 2 -> System.out.print("the Feb " + "has 28 days");
                case 3 -> System.out.print("the Wnd " + "has 31 days");
                case 4 -> System.out.print("the Apr " + "has 30 days");
                case 5 -> System.out.print("the May " + "has 31 days");
                case 6 -> System.out.print("the Jun " + "has 30 days");
                case 7 -> System.out.print("the Jul " + "has 31 days");
                case 8 -> System.out.print("the Aug " + "has 31 days");
                case 9 -> System.out.print("the Sep " + "has 30 days");
                case 10 -> System.out.print("the Oct " + "has 31 days");
                case 11 -> System.out.print("the Dec " + "has 30 days");
                case 12 -> System.out.print("the Nov " + "has 31 days");
            }
        }
    }}
