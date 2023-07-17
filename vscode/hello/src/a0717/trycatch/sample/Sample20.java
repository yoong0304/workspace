package a0717.trycatch.sample;

public class Sample20 {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }
    public static void main(String[] args) {
        Sample20 sample = new Sample20();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();
        }
        System.out.println(c);
    }
}
