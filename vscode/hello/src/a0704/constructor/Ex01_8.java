package a0704.constructor;

import java.util.Scanner;

public class Ex01_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월을 입력하세요.(1~12) : ");
        int m = sc.nextInt();
        if(m<1 || m > 12) {
            System.out.println("월을 다시 입력하세요.");
            m = sc.nextInt();
            
        } else {
            if(3<=m && m<=5) {
                System.out.println("spring");
            } else if(6<=m && m<=8) {
                System.out.println("spring");
            }else if(9<=m && m<=11) {
                System.out.println("spring");
            } else {
                System.out.println("winter");
            }
        }
        sc.close();



        // switch(m) {
        //     case 12: case 1: case 2 :
        //     System.out.println("winter");
        //     break;
        //     case 3: case 4: case 5:
        //     System.out.println("spring");
        //     break;
        //     case 6: case 7: case 8:
        //     System.out.println("summer");
        //     break;
        //     case 9: case 10: case 11:
        //     System.out.println("fall");
        //     break;
        // }
    }
}
