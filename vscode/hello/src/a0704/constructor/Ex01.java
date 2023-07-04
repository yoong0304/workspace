package a0704.constructor;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두개의 문자를 입력하세요");
        String a = scanner.next();
        String b = scanner.nextLine();

        System.out.println("입력하신 문자는" + "'" + a + "'" + ", " + "'" + b + "'" + "입니다");
        System.out.println("순서를 바꾸면" + "'" + b + "'" + ", " + "'" + a + "'" + "입니다");
        scanner.close();
    }
}
