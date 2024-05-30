import java.util.Scanner;

public class weekly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today date");
        int i = input.nextInt();
        switch (i){
            case 0: System.out.print("today is Sunday");
            break;
            case 1: System.out.print("today is Monday");
            break;
            case 2: System.out.print("today is Tuesday");
            break;
            case 3: System.out.print("today is Wednesday");
            break;
            case 4: System.out.print("today is Thursday");
            break;
            case 5: System.out.print("today is Friday");
            break;
            case 6: System.out.print("today is Saturday");
        }
        System.out.println("Enter the amount of judgment value");
        int y = input.nextInt();
        int d;
        d = (i + y) % 7;
        System.out.println(" the original date is  " + i + "the day after the judgment valve is  " + d);
    }
}
