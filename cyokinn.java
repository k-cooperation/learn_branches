import java.util.Scanner;

public class cyokinn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个坐标的点");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("请输入第二个坐标的点");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double length = (int)Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 1.0 / 2);
        System.out.println("此两点中间的距离是 " + length);


    }
}
