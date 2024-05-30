import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("请输入时区");
            int timeZoneOffset = input.nextInt();
            long totalMilliseconds = System.currentTimeMillis();
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = (totalHours + timeZoneOffset)% 24;
            System.out.println("对应该时区的的当前时间" + currentHour + " " + currentMinute + " " +currentSecond);
    }
}
