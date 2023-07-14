package a0714.stream;
import java.util.Arrays;
import java.util.List;
public class stream7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                         .reduce(0, (a,b) -> a + b);    // 리스트의 합

        System.out.println(sum);
    }
}
