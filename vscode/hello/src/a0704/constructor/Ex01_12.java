package a0704.constructor;

import java.util.Scanner;

public class Ex01_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.println("세 정수를 입력하세요.");
            arr[i] = sc.nextInt();
        }
        result = (arr[0] < arr[1]) ? arr[0] : arr[1];
        result = (result < arr[2]) ? result : arr[2];

        System.out.println(result);


        // System.out.println("세 정수를 입력하세요.");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        

        // result = (num1 < num2) ? num1 : num2;
        // result = (result < num3) ? result : num3;

        // System.out.println(result);
        sc.close();
    }
}
