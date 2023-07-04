package a0704.constructor;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {}
// 매개변수의 갯수차이로 구분 오버로딩(지금은 생성자의 오버로딩)
    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
