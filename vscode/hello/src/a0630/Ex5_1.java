package a0630;

import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        // 배열 선언방법
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        // 배열의 내용 넣기
        for(int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;   // 1 ~ 10의 숫자를 순서대로 배열에 넣는다.
        }

        for(int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        // 출력
        for(int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();

        // Arrays.toString() - 배열을 문자열로 변환
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println((iArr3));
        System.out.println((chArr));
        
    }
}
