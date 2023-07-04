package a0704.constructor;

import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("영문자 한 개를 입력하세요");
        String str = sc.nextLine();

        char c = str.charAt(0);
        System.out.println((int)c); // 아스키코드값으로 변환
        sc.close();

    }
}
