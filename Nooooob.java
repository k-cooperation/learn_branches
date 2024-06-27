import java.util.Scanner;
public class Nooooob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input a letter into system");
        int number = scanner.nextInt();

        if (number % 2 ==0){
            System.out.print("number is even");
        }else{
            System.out.print("number is odd");
        }
    }
}

