package a0710;

public class String6 {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("두 메소드 호출 후 원본 문자열 : " + str);
    }
}
