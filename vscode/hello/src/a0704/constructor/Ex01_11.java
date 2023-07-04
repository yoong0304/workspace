package a0704.constructor;

import java.util.Scanner;

public class Ex01_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("한변의 개수를 입력하세요 : ");
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
