package a0714.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        /*
            Person 객체를 생성
            action 메소드를 호출
            첫 번째 호출에서는 람다식 사용하여 work 메서드를 {} 안에 작성
        */

        // 실행문이 두 개 이상인 경우 중괄호 필요(람다식)
        // person.action(() -> {
        //    System.out.println("출근을 합니다."); 
        //    System.out.println("프로그래밍을 합니다."); 
        // });

        // 람다식 x
        person.action(new Workable() {
            @Override
            public void work() {
                System.out.println("출근을 합니다."); 
           System.out.println("프로그래밍을 합니다."); 
            }
        });

        // 실행문이 한 개일 경우 중괄호 생략 가능(람다식)
        // person.action(() -> System.out.println("퇴근합니다."));

        // 람다식 x
        person.action(new Workable() {
            @Override
            public void work() {
                System.out.println("퇴근을 합니다."); 
            }
        });
    }
}
