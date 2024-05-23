public class randomplus {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        System.out.print("what the " + x + y + " plus is ");


        System.out.print("Enter these two number");
        int answer = x + y;
        if (answer == x + y) {
            System.out.print("you are right");
        }
    }
}
