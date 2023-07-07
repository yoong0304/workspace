package a0707.ani;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.sound();

        Cat1 cat1 = new Cat1();
        cat1.sound();

        // 매개변수의 다형성
        animalSound(new Dog1());
        animalSound(new Cat1());
    }
    public static void animalSound(Animal1 animal) {
        animal.sound();
    }
}
