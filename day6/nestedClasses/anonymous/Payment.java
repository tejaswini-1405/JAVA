package nestedClasses.anonymous;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        //boilerplate code
        Payment p=new Payment() {
            public void pay() {
                System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        //SCALA - java 8(Streams, Annotations,Lambdas,reflection)
        Payment p1=() -> System.out.println("Cash payment");
        p1.pay();
    }
}
/*
 ℹ️Points to remember:
  ⭐ One - time implementation
  ⭐ No need to create separate class
  ⭐ It is used in events and Callback functions
 */