package a0704.constructor;

import java.util.Scanner;

public class Ex01_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("길이를 입력해주세요 : ");
        int line = sc.nextInt();

        for(int i = 0; i<line; i++) {
            for(int j = 0; j<line;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
