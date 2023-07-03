package a0703;

import java.util.Scanner;

public class Ex7_2 {
    public static void main(String[] args) {
        boolean run = true;
        int h = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("시간을 입력하세요(0~23) : ");
            h = scanner.nextInt();
            if (h < 0 || h > 23) {
                System.out.println("시간을 다시 입력하세요.");
            } else {
                run = false;
            }
        }
        run = true;
        while (run) {
            System.out.println("분을 입력하세요(0~59) : ");
            m = scanner.nextInt();
            if (m < 0 || m > 59) {
                System.out.println("분을 다시 입력하세요.");
            } else {
                run = false;
            }
        }
        System.out.println("상근이가 입력한 알람 시간은" + h + "시" + m + "분 이다.");

        // 창영이의 알람 방식
        m -= 45;
        if(m < 0) {
            h--;
            if (h < 0) {
                h += 24;
            }
            m += 60;
        }
        System.out.println("창영이 방식의 알람 시간은" + h + "시" + m + "분 이다.");
    }

}
