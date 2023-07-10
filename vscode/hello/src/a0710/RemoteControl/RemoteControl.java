package a0710.RemoteControl;

public interface RemoteControl {

    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추살 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
