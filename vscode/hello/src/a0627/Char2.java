package a0627;

public class Char2 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 97;
        // char b2 = -66; // 에러 남
         
        System.out.println((char)a);
        System.out.println((char)b);    // 유효한 문자 코드가 아님
        System.out.println((char)a2);
    }
}
