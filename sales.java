import java.util.Scanner;
public class sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Purchase amount:");
            double purchaseAmount = input.nextDouble();
                double tax = purchaseAmount * 0.06;
            System.out.println("sales tax is " + (int)(tax*100)/100.0);
    }
}
