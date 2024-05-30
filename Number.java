public class Number {
    public String isOddNumber(int number) {
        if (number % 2 == 0) {
            return "偶数";
        } else {
            return "奇数";
        }
    }

    public static void main(String[] args) {
        int a = 10;
        Number number = new Number();
        String r1 = number.isOddNumber(a);
        System.out.println(a + "是" + r1);
    }
}
