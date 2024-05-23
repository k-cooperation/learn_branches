public class test4 {
    public static void main(String[] args) {
        System.out.println("                  乘法口诀表");
        System.out.println("      ");
        int j;
        for (j = 1; j <= 9; j++)
            System.out.print("    " + j);
        System.out.println("\n---------------------------------------------");
        int i;
        for (i = 1; i <= 9; i++) {
            System.out.println(i + " | ");
        }
        for (i = 1; i <= 9; i++) {
            System.out.printf("%4d", i * j);
        }
        System.out.println();
    }
}


