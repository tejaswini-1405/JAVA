package nestedClasses.memberClasses;

public class BankAccount {
    private double balance=10000;
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance-= amount;
                System.out.println("withdraw;" +amount);
            }else{
                System.out.println("insufficient funds");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        //outer class.Inner class object=out.object.new Inner();
        BankAccount.Transaction tx=account.new Transaction();
        tx.withdraw(2000);
        tx.withdraw(3000);
        System.out.println(account.balance);
    }
}
/*
ℹ️ Points to remember
⭐ Transaction belongs to specific account
⭐ Direct access to private variable balance
⭐ clean encapsulation
 */
