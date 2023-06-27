class Test {
    int field1;
    String field2;
    public void method1() {
        System.out.println("헬로 자바 !");
    }
}

public class Prog{
    public static void main(String[] args) {
        // 자바 프로그램이 맨처음 main() 메서드를 찾아 실행
        // 클래스에 반드시 하나 존재
        Test myTest = new Test();
        myTest.method1();
    }
}
