import java.util.Random;
public class Reborn {
    public static void main(String[] args) {
        Random random = new Random();
        while(true){
            int number = random.nextInt(900) +100;
            if (number % 10 ==0){
                System.out.print(number);
                System.exit(0);
            }
        }
    }
}
