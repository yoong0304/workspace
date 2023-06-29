package a0629;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요.>");
        Scanner scanner = new Scanner(System.in);   // 사용자입력(키보드)을 받는다.
        /*
            Scanner - 자바에서 제공하는 입력을 받는 클래스
            (System.in) 통해서 사용자로 부터 입력을 받을 수 있고
            System.in으로 부터 Scanner 객체를 생성
        */
        /* 
            scanner.nextInt() - 숫자를 입력 받을 수 있다.
            scanner.nextLine() - 문자열을 입력 받을 수 있다.
        */
        int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장
        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 게절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 게절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
            // 그 외 숫자
                System.out.println("현재의 계절은 겨울입니다.");
        }
        scanner.close();
    }
}
