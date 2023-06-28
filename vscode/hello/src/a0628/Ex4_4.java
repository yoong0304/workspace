package a0628;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        
        System.out.printf("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        score = input;
        if(score >= 90){
            grade = 'A';
        }else if(score < 90 && score >= 80) {
            grade = 'B';
        }else if(score < 80 && score >= 70) {
            grade = 'C';
        }else if(score < 70 && score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("당신의 점수는 %d이므로 %c등급입니다.", input, grade);

    }
}
