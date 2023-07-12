package a0712.exam01;

public class Product<K, M> {    // 타입 파라미터로 K와 M 정의
    // 타입 파라미터를 필드 타입으로 사용
    private K kind;
    private M model;

    // 메소드
    public K getKind() {return this.kind;}
    public M getModel() {return this.model;}
    public void setKind(K kind) {this.kind = kind;}
    public void setModel(M model) {this.model = model;}
}
/*
    제네릭을 사용해서 제품(product)을 나타내는 클래스를 구현한 예제 입니다.
    Product 클래스에는 K, M을 사용하여 두개의 타입변수를 가지고 있음
    이를 통해서 제품의 종류인(kind)와 모델(model)에 대한 타입을 유연하게 설정할 수 있다.
*/
