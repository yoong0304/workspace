package a0704.constructor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            System.out.println("세 정수를 입력하세요.");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        System.out.println(min);
        sc.close();
    }
}
