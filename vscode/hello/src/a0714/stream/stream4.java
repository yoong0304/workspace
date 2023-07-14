package a0714.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class stream4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

        List<Integer> distinctNumbers = numbers.stream()
               .distinct()      // 중복제거
               .collect(Collectors.toList());

               System.out.println(distinctNumbers);
    }
}
