package a0713.Ex01;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student1> treeSet = new TreeSet<Student1>();
        treeSet.add(new Student1("blue", 96));
        treeSet.add(new Student1("hong", 86));
        treeSet.add(new Student1("white", 92));

        Student1 student1 = treeSet.last();
        System.out.println("최고 점수 : " + student1.score);
        System.out.println("최고 점수를 받은 아이디 : " + student1.id);

    }
}
