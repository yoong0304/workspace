package a0706;

public class SmartPhoneExample2 {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone2 myPhone2 = new SmartPhone2("갤럭시", "은색", 300);
    
        // Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델 : " + myPhone2.model);
        System.out.println("색상 : " + myPhone2.color);
        System.out.println("무게 : " + myPhone2.weight + "g");
        
    }
    
}
