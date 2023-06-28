package a0628;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';
        
        System.out.printf("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        if(score >= 90){
            grade = 'A';
            if(score >= 98) {
                opt = '+';
            }else if(score < 94) {
                opt = '-';
            }
        }else if(score >= 80) {
            grade = 'B';
        }else {
            grade = 'C';
        }
        System.out.printf("당신의 점수는 %d이므로 %c%c등급입니다.%n", score, grade, opt);

    }
}
