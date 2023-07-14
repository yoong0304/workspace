package a0714.streamEx;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// 정수로 구성된 리스트에서 짝수만 필터링하고, 필터링된 짝수들의 제곱값을 구하여 리스트로 반환하는 스트림 연산
public class streamEx1 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squaredEvenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squaredEvenNumbers);
    }
}
