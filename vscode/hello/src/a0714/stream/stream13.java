package a0714.stream;

import java.util.stream.Stream;

public class stream13 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
      
        stream.map(s -> s.length()).forEach(System.out::println);
        // map 메소드는 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여 그 반환 값들로 이루어진 새로운 스트림을 반환한다.
    }
}
