package a0713.exam04;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        if(age < o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
    /*
        compareTo() 메서드의 매개변수 o는 비교할 대상이 Person 객체 
        1. 현재 객체의 나이(age)가 비교 대상 객체의 나이보다 작으면 -1 리턴
            - 현재 객체를 비교 대상 객체보다 앞에 위치시킨다.
        2. 현재 객체의 나이(age)가 비교 대상 객체의 나이가 같다면 0 리턴
            - 두 객체를 동일한 순서로 정렬
        3. 현재 객체의 나이(age)가 비교 대상 객체의 나이보다 크면 1 리턴
            - 현재 객체를 비교 대상 객체보다 뒤에 위치시킨다.
    */
}
