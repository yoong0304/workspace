package a0629;

public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i <= 5; i++) {
            num = (int)((Math.random() * 6) + 1); // (int) 다운스케일링
            System.out.println(num);
        }
    }
}
