package a0705;

public class AccountTest01_1 {
    public static void main(String[] args) {
        Account1 a = new Account1("123-45", 10000);
        Account1 b = new Account1("567-89", 10000);

        /*
            while 루프를 이용해서 a계좌에서 b계좌로 3000을 이체하는 동안 반복
            transfer 메서드는 이체가 성공하면 'true'를 반환하고, 실패하면 'false'를 반환
        */
        while (a.transfer(b, 3000)) {
            
        }

        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}
class Account1 {
    String num;
    int balance;

    public Account1(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account1 account1, int amount) {
        if(balance < amount){ // 3000 보다 잔액이 부족하면 종료
            return false;
        }
        balance -= amount; // a의 balance를 amount(3000)을 빼서 balance에 저장
        account1.balance += amount; // b의 balance를 amount(3000)을 더해서 balance에 저장
        return true;
    }

    public String toStr() {
        return String.format("Account1 { num : %s, balance : %d}", num, balance);
    }

}
