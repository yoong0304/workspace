package a0706;

public class OverloadingTest {
    public static void main(String[] args) {
        
        //OverloadingTest 객체 생성
        OverloadingTest1 ot = new OverloadingTest1();
        
        //매개변수가 없는 cat() 호출
        ot.cat();
        
        //매개변수가 int형 두개인 cat() 호출
        ot.cat(20, 80);
        
        //매개변수가 String 한개인 cat() 호출
        ot.cat("오버로딩 예제입니다.");
        
    }
}
class OverloadingTest1{
    //이름이 cat인 메서드
    void cat(){
        System.out.println("매개변수 없음");
    }
    
    //매개변수 int형이 2개인 cat 메서드
    void cat(int a, int b){
        System.out.println("매개변수 :"+a+", "+b);
    }
    
    //매개변수 String형이 한 개인 cat 메서드
    void cat(String c){
        System.out.println("매개변수 : "+ c);
    }
    
}