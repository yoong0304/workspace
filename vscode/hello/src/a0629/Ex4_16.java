package a0629;

import java.util.Scanner;

public class Ex4_16 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1과 100사이의 정수를 입력하세요 : ");
        do{
            input = scanner.nextInt();
            if(input > answer) {
                System.out.println("DOWN 다시 입력하세요 :");
            } else if(input < answer) {
                System.out.println("UP 다시 입력하세요 :");
            }
        } while(input != answer);
        System.out.println("정답입니다~");

    }
}
