public class Datatype1 {
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;
        System.out.println(num1);
        System.out.println(num2);
        // byte는 1byte를 뜻 하고 -128 ~ 127 까지 표현한다.
        // short는 2byte -> -32768 ~ 32767 2의15승
        // int는 4byte -> -2,147,483,648 ~ 2,147,483,647 2의31승
        // long 8byte -> 2의63승
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);

    }
}
