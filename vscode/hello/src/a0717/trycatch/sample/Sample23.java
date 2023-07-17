package a0717.trycatch.sample;

/*
    동작하고 있는 프로그램을 프로세스(process)라고 한다.
    보통 한 개의 프로세스는 한 가지의 일을 하지만,
    쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다. -> 멀티 쓰레드
*/
public class Sample23 extends Thread {
    public void run() {         // Thread를 상속하면 run 메서드를 구현해야 한다.
        System.out.println("thread run.");
    }
    public static void main(String[] args) {
        Sample23 sample = new Sample23();
        sample.start();     // start()로 쓰레드를 실행한다.
    }
}
