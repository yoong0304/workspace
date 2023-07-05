package a0705;

public class Dog {
    // 객체 지향 프로그래밍 - Object Oriented Programing - OOP
    String name;
    String breeds;
    int age;

    void wag() {
        System.out.printf("[%s] 살랑살랑~\n", name);
    }
    void bark() {
        System.out.printf("[%s] 멍멍!\n", name);
    }
    void bark(int times) {
        String sound = "컹컹!";
        System.out.printf("[%s] %s(x%d)~\n", name, sound, times);
    }
    // 메소드 오버로딩 - 입려 변수의 개수나 타입으로 구분하는 기법, 오버라이딩과는 다르다.
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "망고";
        d1.breeds = "골든리트리버";
        d1.age = 2;
        d2.name = "까미";
        d2.breeds = "믹스";
        d2.age = 3;

        System.out.printf("d1 => {%s, %s, %d세}\n", d1.name, d1.breeds, d1.age);
        System.out.printf("d2 => {%s, %s, %d세}\n", d2.name, d2.breeds, d2.age);

        d1.wag(); // 꼬리치기
        d2.bark(); // 짖기
        d1.bark(3); // 짖기 3회
    }
}
