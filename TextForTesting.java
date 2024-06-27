import java.util.Scanner;
public class TextForTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("plz entre the string that you want");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
