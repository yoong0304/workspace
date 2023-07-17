package a0717.Ex01;

import java.util.Arrays;
import java.util.List;

// 대소문자 상관없이 'java'라는 단어가 포함된 문자열만 필터링해서 줄력
public class Ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "This is a java book",
            "Lambda Expressions",
            "Java8 supports lambda expressions"
        );
        list.stream()
            .filter(item -> item.toUpperCase().contains("Java"))
            .forEach(item -> System.out.println(item));
    }    
}
