import java.util.Scanner;

public class HelloShit {
    public static void main(String[] args) {
        System.out.print("Please select a card (1~52):");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        String color = "";
        switch ((select - 1) / 13) {
            case 0 -> color = "Clubs";
            case 1 -> color = "Diamonds";
            case 2 -> color = "Hearts";
            case 3 -> color = "Spades";
        }
        String num = "";
        switch (select % 13) {
            case 1 -> num = "Ace";
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> num = "" + (select % 13);
            case 11 -> num = "Jack";
            case 12 -> num = "Queen";
            case 0 -> num = "King";
        }
        System.out.println("The card you picked is " + num + " of " + color);


    }

}
