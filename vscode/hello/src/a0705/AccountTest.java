package a0705;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.balacne = 1000; ERROR
        acc.setBalance(1000);
        System.out.printf("잔액 : %d\n", acc.getBalance());
    }
}
class Account {
    private int balance;

    // 게터 메서드
    public int getBalance() {
        return balance;
    }
    // 세터 메서드
    public void setBalance(int b) {
        balance = b;
    }
}
