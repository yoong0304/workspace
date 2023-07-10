package a0710;

public class String2 {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.compareTo("bcdef"));
        System.out.println(str.compareTo("abcd"));

        System.out.println(str.compareTo("Abcd"));  // 유니코드 값의 차이
        System.out.println(str.compareToIgnoreCase("Abcd"));    // compareToIgnoreCase 대소문자 구분 X
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
    }
}
