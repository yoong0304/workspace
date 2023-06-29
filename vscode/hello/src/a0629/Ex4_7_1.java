package a0629;

public class Ex4_7_1 {
    public static void main(String[] args) {
        // for (int i = 1; i<=100; i=i+2) {
        //     System.out.println(i);
        // }
        // int num = 0;
        // for (int i = 1; i<=100; i++) {
        //     num += i;
        // }
        // System.out.println(num);
        int sum = 0;
        for (int i = 1; i<=100; i++) {
            sum += i;
        }
        System.out.printf("1부터 100까지의 합은 %d이다.", sum);
    }
}
