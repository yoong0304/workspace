package a0711;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
            .append("DEF")  //def
            .insert(0,"ABC")    // abcdef
            .delete(3, 4)   // d
            .toString();    //toString()이 없으면 에러가 뜬다.
        System.out.println(data);
    }
}
// StringBulider는 가변성을 가진 클래스로, 문자열을 추가, 수정, 삭제하는 등의 작업을 효과적으로 처리
