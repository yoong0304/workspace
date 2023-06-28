package a0628;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        // score에 80을 대입 후 if문으로 score가 60이상이면 "합격입니다." 를 출력하시오.
        Scanner scanner = new Scanner(System.in);

        int score;
        System.out.printf("점수를 입력하세요.>");
        score = scanner.nextInt();

        if(score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
}
