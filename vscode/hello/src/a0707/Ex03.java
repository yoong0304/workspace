package a0707;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int maxCal = 500, sumCal = 0;
        int[] arr = { 400, 340, 170, 100, 70, 500 };

        System.out.println("1.치즈버거 | 2.야채버거 | 3.우유 | 4.계란말이 | 5.샐러드");

        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴 번호를 두 개 고르세요.> ");
        int menuNum1 = sc.nextInt(), menuNum2 = sc.nextInt();

        sumCal = arr[menuNum1 - 1] + arr[menuNum2 - 1];

        if (maxCal < sumCal) {
            System.out.println("총 칼로리 : " + (arr[menuNum1 - 1] + arr[menuNum2 - 1]));
            System.out.println("angry");
        } else if (maxCal > sumCal) {
            System.out.println("총 칼로리 : " + (arr[menuNum1 - 1] + arr[menuNum2 - 1]));
            System.out.println("no angry");
        }
        sc.close();

    }
}
