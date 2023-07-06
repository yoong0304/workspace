package a0706;

public class Math01 {
    public static void main(String[] args) {
        // 올림
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.000001));
        // 내림
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        // 반올림
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4));
        System.out.println(Math.round(10.5));
    }
}
