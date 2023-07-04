package a0704.constructor;

import java.util.Scanner;

public class Ex01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("하나의 단어를 입력하세요.(단어의 길이는 50글자 이하) : ");
        String b = scanner.nextLine();
        System.out.println(b);
        
        scanner.close();
    }
}
