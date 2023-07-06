package a0706;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. 월요일\n");
        System.out.printf("2. 화요일\n");
        System.out.printf("3. 수요일\n");
        System.out.printf("4. 목요일\n");
        System.out.printf("5. 금요일\n");
        System.out.printf("6. 토요일\n");
        System.out.printf("7. 일요일\n");
        
        System.out.print("요일 번호를 입력하세요.> ");
        int input = sc.nextInt();
        if (input == 1 || input == 3 || input == 5 || input == 7) {
            System.out.println("oh my god");
        }else {
            System.out.println("enjoy");
        }

    }
}
