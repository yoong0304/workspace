package a0706;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        boolean run = true;
        String[] a1 = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] a2 = {"", "십", "백", "천", "만", "십만"};
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.(0~99999) : ");
        int num = sc.nextInt();

        String sNum = Integer.toString(num);
        for (int i = 0; i <= sNum.length()-1; i++) {
            int n = sNum.charAt(i) - '0';
            String s = a1[n];
            System.out.print(s);
        }
        sc.close();
        
        
    }
}

