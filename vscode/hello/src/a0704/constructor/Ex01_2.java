package a0704.constructor;

import java.util.Scanner;

public class Ex01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수 한 개를 입력하세요. : ");
        float num1 = scanner.nextFloat();
        float num2 = 0;
        // 방법1
        System.out.printf("입력한 실수는 %.2f입니다.", num1);

        // 방법2
        num2 = (num1 + 0.005f) * 100;
        System.out.println(num2);
        int i = (int)num2;
        num2 = (float)i / 100;
        System.out.println(num2);
        scanner.close();
        
    }
}
