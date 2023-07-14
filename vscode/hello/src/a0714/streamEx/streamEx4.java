package a0714.streamEx;

import java.util.List;
import java.util.Arrays;

// 사용자 객체(User)의 리스트에서 모든 사용자의 나이를 합산한 값을 구하는 스트림 연산
public class streamEx4 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
        new User("Alice", 25),
        new User("Bob", 30),
        new User("Charlie", 20),
        new User("David", 22)
    );

    int totalAge = users.stream()
                        .mapToInt(User::getAge)
                        .sum();

    System.out.println(totalAge);
    }
}
