package a0705;

public class UtilTest {
    public static void main(String[] args) {
        Util.m1();
        
        // Util.m2(); ERROR
        // 인스턴스 호출 시 반드시 객체 생성
        Util util = new Util();
        util.m2();
    }
}
class Util {
    static void m1() {
        System.out.println("클래스 메서드 m1()이 호출되었습니다.");
    }
    void m2() {
        System.out.println("인스턴스 메서드 m2()가 호출되었습니다.");
    }
}
