package a0704.constructor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수 한 개를 입력하세요. : ");
        float num = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("#.##");
        String rounded = df.format(num);
        
        System.out.println(rounded);
        scanner.close();
        
    }
}
