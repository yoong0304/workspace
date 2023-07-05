package a0705;

import java.util.Scanner;

public class Ex7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("공이 몇미터 날아갔나요?");
        int num = sc.nextInt();
        if((num >= 30 && num <=40) || (num >= 60 && num <= 70)) {
            System.out.println("슬기 win");
        } else {
            System.out.println("슬기 lose");
        }
        sc.close();
    }
}
