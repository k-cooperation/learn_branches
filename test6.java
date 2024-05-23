public class test6 {
    public static void main(String[] args) {
        double fee = 10000;
        int year = 0;
        while (fee < 20000) {
            fee = fee * (1 + 0.07);
            year++;
        }
        System.out.print("当学费高于20000时，该学年为" + year);
    }
}
