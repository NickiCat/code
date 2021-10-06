class Basket {
    void pay(double money) {
        System.out.println("Paid in cash: " + money);
    }
    void pay(String cardNum) {
        System.out.println("Paid with card: " + cardNum);
    }
    void pay(String accountNum, String bankCode) {
        System.out.println("Paid with account: " + accountNum + " " + bankCode);
    }
}

public class BasketDemo {
    public static void main(String[] args) {
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();

        System.out.print("b1 = ");
        b1.pay(200.5);
        System.out.print("b2 = ");
        b2.pay("4565234654354");
        System.out.print("b3 = ");
        b3.pay("He3k", "4560");

    }
}
