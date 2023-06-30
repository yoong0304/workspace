package a0630;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열을 생성

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }
        System.out.println(Arrays.toString(ball));
        
        int tmp = 0;
        int j = 0;
        for(int i = 0; i < 6; i++){
            j = (int)(Math.random() * 45); // 0 ~ 44범위의 임의의 값을 얻는다.
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
