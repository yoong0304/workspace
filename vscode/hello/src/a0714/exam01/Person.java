package a0714.exam01;

public class Person {
    public void action(Workable workable) {
        workable.work();
    }

    /*
        action 메서드 정의
        이 메서드는 Workable 인터페이스에서 매개변수로 받아서
        workable 객체의 work 메서드를 호출
        
        action 메서드는 매개변수로 전달된 workable 객체의 work 메서드를 실행
    */
}
