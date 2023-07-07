package a0707;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 2개를 입력하세요");
        double num1 = sc.nextInt(),
        num2 = sc.nextInt(),
        maxNum = 0;
        arr[0] = num1 + num2;
        arr[1] = num2 + num1;
        arr[2] = num1 - num2;
        arr[3] = num1 - num2;
        arr[4] = num1 * num2;
        arr[5] = num1 * num2;
        arr[6] = num1 / num2;
        arr[7] = num1 / num2;
        arr[8] = Math.pow(num1, num2);
        arr[9] = Math.pow(num2, num1);
        
        for(int i = 0; i < arr.length; i++){
            if(maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.printf("%1f",maxNum);
        sc.close();
    }
}
