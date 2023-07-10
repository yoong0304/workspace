package a0710.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}

