import java.util.Scanner;

public class rinnkihennka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int a = input.nextInt();
        double n = 4 * (Math.random());
        a = (int) n + 1;
        switch (a) {
            case 1:
                System.out.print(x += 5);
                break;
            case 2:
                System.out.print(x += 10);
                break;
            case 3:
                System.out.print(x += 16);
                break;
            case 4:
                System.out.print(x += 34);
        }
    }
}
