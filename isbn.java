import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class isbn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请依次输入对应的数值");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();
        int k = ((d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11);
        if (k == 10){
            System.out.print("该书本的对应国际书籍编号ISBN-10是 " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "x");
        }
    }
}
