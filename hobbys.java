public class hobbys {
    public static void main(String[] args){
        int[]myList = new int[5];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("enter" + myList.length+"values");
        for (int i = 0;i < myList.length;i++)
            myList[i] = (int) input.nextDouble();
    }
}