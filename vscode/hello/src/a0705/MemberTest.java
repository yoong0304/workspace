package a0705;

public class MemberTest {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        System.out.printf("이름 : %s, id : %s", user1.name, user1.id);
    }
}
class Member {
    String name;
    String id;
    String password;
    int age;
    
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

}
