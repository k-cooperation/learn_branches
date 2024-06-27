import java.util.Scanner;

public class customers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("plz entre n1 into system ");
        double n1 = scanner.nextDouble();
        System.out.println("plz entre n2 into system");
        double n2 = scanner.nextDouble();
        double p = n1 + n2;
        double s = n1 * n2;
        double d = n1 - n2;

        System.out.println("p is " + p);
        System.out.println("s is " + s);
        System.out.println("d is " + d);

        if (n2 != 0) {
            double q = n1 / n2;
            System.out.println(" q  is " + q);
        } else {
            System.out.println("q  is zero no way");
        }
    }
}
