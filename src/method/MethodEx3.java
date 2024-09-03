package method;

public class MethodEx3{
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 100000);


    }
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금. 현재 잔액 : " + balance);
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금. 현재 잔액 : " + balance);
        }
        else{
            System.out.println("잔액 부족으로 출금 실패");
        }
        return balance;
    }

}