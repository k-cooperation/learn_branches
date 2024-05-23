import java.util.Scanner;
public class timemechani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入当前时区偏离");
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.print("the time now is" + currentHour +":" + currentMinute + ":" + currentSecond + "GMT");
    }
}
