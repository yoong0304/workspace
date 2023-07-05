package a0705;

import java.util.Scanner;

public class Ex7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("공이 몇미터 날아갔나요?");
        int num = sc.nextInt();
        if((num >= 50 && num <= 70) || (num % 6 == 0)) {
            System.out.println("슬기 win");
        } else {
            System.out.println("슬기 lose");
        }


        sc.close();
    }
}
