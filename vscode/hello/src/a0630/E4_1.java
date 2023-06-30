package a0630;

public class E4_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 21; i++){
            if(i % 2 == 0){
                continue;
            } else if(i % 3 == 0) {
                continue;
            }
            sum += i;
	        System.out.println(i + ", " + sum);
            // System.out.println(sum);
        }

    }
}
