package a0629;

public class Ex4_11 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // %2d 정수를 출력할 때 최소 2자리로 출력하고, 필요한 경우 앞을 공백으로 채우는 형식 지정자
    }
}
