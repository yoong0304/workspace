package a0630;

public class Ex5_10_1 {
    public static void main(String[] args) {
        // int[][] arr = {
        //     { 5, 5, 5, 5, 5 },
        //     { 10, 10, 10, 10, 10 },
        //     { 20, 20, 20, 20, 20 },
        //     { 30, 30, 30, 30, 30}
        // };

        // int total = 0;
        // float average = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         total = total + arr[i][j];
        //         average++;
        //     }
        // }
        // average = total / average;
        // System.out.println("total = " + total);
        // System.out.println("average = " + average);

        int sum = 0;
        int i = 0;
        do {
            i++;
            if (i % 2 == 0){
                sum += -i;
            }else {
                sum += i;
            }
            System.out.println(sum);
            System.out.printf("i=%d%n",i);
        }while( sum < 100);
    }
}
