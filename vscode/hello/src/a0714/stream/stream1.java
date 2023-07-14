package a0714.stream;
import java.util.Arrays;
import java.util.List;
public class stream1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // 숫자들을 출력하는 람다식
        numbers.forEach(number -> System.out.println(number));
    }
}
