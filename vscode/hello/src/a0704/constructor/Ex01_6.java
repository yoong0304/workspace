package a0704.constructor;

import java.util.Scanner;

public class Ex01_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("첫번째 정수를 입력하세요");
        num1 = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        num2 = sc.nextInt();
        System.out.println("세번째 정수를 입력하세요");
        num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double avg = (double) sum / 3;
        System.out.println(sum + avg);
        
        sc.close();


    }
}
