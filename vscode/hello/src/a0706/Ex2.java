package a0706;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int year = 2023;
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 앞자리를 입력하세요.(6자리) :");
        String num = sc.next();
        System.out.print("성별정보를 입력하세요.(1,2,3,4) :");
        int s = sc.nextInt();
        String sex = "";
        num = num.substring(0, 2);
        if (s == 1 || s == 3) {
            sex = "남자";
            if (s == 1) {
                num = "19" + num;
            } else {
                num = "20" + num;
            }
        } else if (s == 2 || s == 4) {
            sex = "여자";
            if (s == 2) {
                num = "19" + num;
            } else {
                num = "20" + num;
            }
        }
        
        System.out.printf("성별정보가 %d 이므로 %s년생 %s, %d살이다", s, num, sex, year - Integer.parseInt(num));
        sc.close();

    }
}
