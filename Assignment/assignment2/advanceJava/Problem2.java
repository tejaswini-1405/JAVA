//Create an interface Payment with method pay(). Implement it in CreditCardPayment
//and UPIPayment classes.

package assignment2.advanceJava;
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}
class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(2000);

        Payment p2 = new UPIPayment();
        p2.pay(500);
    }
}
