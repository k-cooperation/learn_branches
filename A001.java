
public class A001 {
    public static void main(String args[]) {
        int n = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    // 问题：最内层有多少次的循环？

                    if ((i != j) && (i != k) && (j != k)) {
                        // 注意结果是怎么产生的
                        System.out.println(i * 100 + j * 10 + k);
                        n++;
                    }
                }
            }
        }
        System.out.println("Total count : " + n);
    }
}

