package a0630;

public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 }
        };
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("====================================");
        for (int i = 0; i < score.length; i++) {
            int sum = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal = korTotal + score[i][0];
            engTotal = engTotal + score[i][1];
            mathTotal = mathTotal + score[i][2];

            System.out.printf("%3d", i + 1); // 번호

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%6d ", score[i][j]); // 기본점수
            }
            avg = (float) sum / score[i].length;
            System.out.printf("%4d %5.1f",sum, avg);
            System.out.println();
        }
        System.out.println("====================================");
        System.out.printf("총점: %3d %6d %6d", korTotal, engTotal, mathTotal);

    }
}
