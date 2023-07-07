package a0707;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 자연수를 입력 > ");
        int a = sc.nextInt(), b = sc.nextInt(), c = 0;
        if(b % a == 0) {
            c = b / a;
            System.out.printf("%d * %d = %d", a, c, b);
        } else if(a % b == 0) {
            c = a / b;
            System.out.printf("%d * %d = %d", b, c, a);
        } else {
            System.out.println("none");
        }
        sc.close();
        
    }
}
