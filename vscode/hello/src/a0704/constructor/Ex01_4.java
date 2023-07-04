package a0704.constructor;

import java.util.Scanner;

public class Ex01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년 월 일을 순서대로 입력하세요");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.printf("%d.%02d.%02d%n", year, month, day);
        // System.out.printf(String.format("%d.%02d.%02d", year, month, day));
        sc.close();
    }
}
