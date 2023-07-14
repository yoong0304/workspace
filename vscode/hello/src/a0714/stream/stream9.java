package a0714.stream;

import java.util.stream.Stream;

public class stream9 {
    public static void main(String[] args) {
        // 배열에서 스트림 생성

        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream.forEach(System.out::println);
    }
}
