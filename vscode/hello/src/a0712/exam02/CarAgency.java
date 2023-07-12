package a0712.exam02;

public class CarAgency implements Rentable<Car> {       // 타입 파라미터 P를 Car로 대체
    @Override
    public Car rent() {
        return new Car();                               // 리턴 타입이 반드시 Car이어야 함
    }
}
/*
    CarAgency, HomeAgency는 Rentable인터페이스를 구현합니다.
    CarAgency 클래스는 Car 객체를 생성하여 반환
    HomeAgency 클래스는 Home 객체를 생성하여 반환
*/