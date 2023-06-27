package a0627;

public class Final1 {
    public static void main(String[] args) {
        // final 바뀌지 않는 값 재할당이 안됨
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;
        

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
