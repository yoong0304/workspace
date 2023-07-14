package a0714.streamEx;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;


// 문자열로 구성된 리스트에서 중복을 제거하고 알파벳 순으로 정렬된 리스트로 변환하는 스트림 연산
public class streamEx5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "carrot", "banana", "eggplant");
        List<String> uniqueSortedStrings = strings.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(uniqueSortedStrings);
    }
}
