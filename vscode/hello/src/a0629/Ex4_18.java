package a0629;

public class Ex4_18 {
    public static void main(String[] args) {
        int num1 = 0, num2 =0, sum = 0;
        // do{
        //     num1 = (int)(Math.random()*6)+1;
        //     num2 = (int)(Math.random()*6)+1;
        //     sum = num1 + num2;
        //     System.out.printf("(%d), (%d) 눈의 합은 %d%n",num1,num2,sum);
        // }while(sum != 5);
        while(sum != 5) {
            num1 = (int)(Math.random()*6)+1;
            num2 = (int)(Math.random()*6)+1;
            sum = num1 + num2;
            System.out.printf("(%d), (%d) 눈의 합은 %d%n",num1,num2,sum);
        }
    }
}
// System.out.println("("+num1+","+num2+")");