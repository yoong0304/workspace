package a0714.streamEx;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

// 사용자 객체(User)의 리스트에서 나이가 20 이상인
public class streamEx3 {
    public static void main(String[] args) {
        // List<User> users = Arrays.asList(
        //     new User("Alice", 25),
        //     new User("Bob", 30),
        //     new User("Charlie", 20),
        //     new User("David", 22)
        // );
        List<User> users = Arrays.asList();
            User.add("Alice", 25);
            User.add("Bob", 30);
            User.add("Charlie", 20);
            User.add("David", 22);
       
    
        Optional<User> youngestUser = users.stream()
            .filter(user -> user.getAge() >= 20)
            .min(Comparator.comparing(User::getName));

        System.out.println(youngestUser);
    }
}
