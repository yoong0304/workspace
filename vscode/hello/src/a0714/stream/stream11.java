package a0714.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class stream11 {
    public static void main(String[] args) {
        // 지정된 범위의 연속된 정수에서 스트림 생성
        IntStream stream1 = new Random().ints(4);
        stream1.forEach(System.out::println);
        System.out.println();

        
    }
}
