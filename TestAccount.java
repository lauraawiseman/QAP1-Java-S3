
 
public class TestAccount {
    public static void main(String[] args) {
        Account Acc1 = new Account("1", "Acc1", 5000);
        Account Acc2 = new Account("2", "Acc2" , 4000);
    
        System.out.println("Initial Balance:");
        System.out.println("Account 1 Balance: $" + Acc1.getBalance());
        System.out.println("Account 2 Balance: $" + Acc2.getBalance());

        // Transfer $1000 form account 1 to account 2

        if (Acc1.transferTo(Acc2, 1000.00)){
            System.out.println("$1000.00 transferred from Account 1 to Account 2.");
        } else {
            System.out.println("Transfer failed.");
        }

        System.out.println("Balance After Transfer:");
        System.out.println("Account 1 Balance: $" + Acc1.getBalance());
        System.out.println("Account 2 Balance: $" + Acc2.getBalance());
    }
    
   
}
