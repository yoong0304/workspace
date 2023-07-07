package a0703;

import java.util.Scanner;

public class Ex6_6_3 {
    public static void main(String[] args) {
        boolean run = true;
        int[] scores = null;
        int stuNum = 0;
        int sum = 0;
        int maxScore = 0;
        float avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("학생수> ");
                    stuNum = scanner.nextInt();
                    scores = new int[stuNum];
                    break;

                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]>");
                        scores[i] = scanner.nextInt();
                        sum += scores[i];
                    }
                    break;

                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] : " + scores[i]);
                    }
                    break;

                case 4:
                    for (int i = 0; i < scores.length; i++) {
                        if(scores[i] > maxScore) {
                            maxScore = scores[i];
                        }
                    }
                    avg = sum / scores.length;
                    System.out.println("최고 점수 : " + maxScore);
                    System.out.println("평균 점수 : " + avg);
                    break;

                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
