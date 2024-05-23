import java.util.Scanner;

public class eiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入五一劳动节想看的电影");
        char namae = (char) input.nextInt();
        if (namae == 1) {
            System.out.print("赤い疑惑");
        } else if (namae == 2) {
            System.out.print("Titanic");
        }
    }
}


