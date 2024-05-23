public class shotcircuit {
    public static void main(String[] args) {
        int balance = 10;
        while (true) {
            if (balance < 9)
                break;
            balance -= 9;
        }
        System.out.print("Balance is " + balance);
    }
}
