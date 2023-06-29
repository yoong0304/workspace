package a0629;

public class Ex4_17 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i%3 != 0){
                continue;
            }
            sum+=i;
            System.out.printf("i = %2d sum = %4d", i, sum);
            System.out.println();
        }
        System.out.printf("3의 배수의 총합 :%d", sum);
    }
}
