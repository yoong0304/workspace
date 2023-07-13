package a0713.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // 해쉬코드 메서드는 객체의 해쉬 코드를 반환 메서드 객체의 필드들이 동일하면 같은 동일한 해쉬코드가 반환

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member target = (Member) obj;
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }




    // JAVA 16v
    // @Override
    // public boolean equals(Object obj) {
    //     if(obj instanceof Member target) {
    //         return target.name.equals(name) && (target.age == age);
    //     } else {
    //         return false;
    //     }
    // }




}
