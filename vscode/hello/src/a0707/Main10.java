package a0707;

public class Main10 {
    public static void main(String[] args) {
        Archer archer1 = new Archer("궁수1", "상");
        Archer archer2 = new Archer("궁수1", "상");
        System.out.println(archer1 == archer2);
        System.out.println(archer1.equals(archer2));
    }
}
