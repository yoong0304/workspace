package a0706.package2;
import a0706.package1.A;
public class D extends A {
    // 생성자 선언
    public D() {
        // A() 생성자 호출
        super();
    }
    /*
        D클래스는 A 클래스와 다른 패키지에 있으나,
        A의 자식 클래스이므로 A의 필드, 메소드 생성자에 접근이 가능하다.
    */
    // 메소드 선언
    public void method1() {
        // A필드값 변경
        this.field = "value";
        // A 메소드 호출
        this.method();
    }
    // 메소드 선언
    public void method2() {
        // A a = new A();  // X
        // a.field = "value";  // X
        // a.method();     // X
    }
    // 직접 개체 생성해서 사용은 안된다.
}
