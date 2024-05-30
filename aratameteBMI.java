import java.util.Scanner;

public class aratameteBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight");
        double weight = input.nextDouble();
        System.out.println("Enter the feet");
        double height = input.nextDouble();
        final double METERS_PER_INCH = 0.0254;
        double BMI = weight * METERS_PER_INCH / (height * METERS_PER_INCH * height * METERS_PER_INCH);
        System.out.print("BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("  too thin ");
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("  normal");
        } else if (BMI >= 25.0 && BMI < 30.0) {
            System.out.println("  overweight");
        } else if (BMI <= 30.0) {
            System.out.println("  overweight");
        }
    }
}
