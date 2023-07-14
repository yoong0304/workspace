package a0714.streamEx;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// 문자열로 구성된 리스트에서 길이가 5이상인 문자열을 필터링하고, 필터링된 문자열들을 대문자로 변환하여 콤마(,)로 구분된 하나의 문자열로 결합하는 스트림 연산
public class streamEx2 {
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("apple", "banana", "carrot", "dragonfruit", "eggplant");
        String result = strings.stream()
            .filter(s -> s.length() >= 5)
            .map(String::toUpperCase)
            .collect(Collectors.joining(", "));
            
        System.out.println(result);
    }
    
}
