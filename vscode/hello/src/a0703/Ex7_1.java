package a0703;

import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while(run) {
            System.out.println("년도를 입력하세요(1~4000) : ");
            int year = scanner.nextInt();
            if (year < 1 || year > 4000) {
                System.out.println("년도를 다시 입력하세요.");
            }
            else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("윤년이다." + 1);
                run = false;
            } else {
                System.out.println("윤년이 아니다." + 0);
                run = false;
            }
        }
        scanner.close();
    }
}
