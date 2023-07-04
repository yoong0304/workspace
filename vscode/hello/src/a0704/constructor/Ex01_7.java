package a0704.constructor;

import java.util.Scanner;

public class Ex01_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = (num1 > num2) ? num1 : num2;
        System.out.println(sum);
        sc.close();
    }
}
