package a0628;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        // 아스키코드 값 비교   소문자 a = 97 대문자 C = 67
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a' <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
        System.out.printf(" 'a' <= ch && ch <= 'z' = %b%n ", 'a' <= ch && ch <= 'z');
        // && 앞뒤에 둘다 식이 참이여야만 true
        // || 앞, 뒤 하나만 참이면 true
    }
}
