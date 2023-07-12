package a0712.exam02;

public interface Rentable<P> {  // 타입 파라미터 P 정의
    P rent();                   // 타입 파라미터 P를 리턴 타입으로 사용
}
/*
    Rentable 이라는 인터페이스는 제네릭타입 P를 받아서 rent() 메서드를 선언
    rent() 메서드는 P타입의 객체를 반환
*/