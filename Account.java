public class Account{
    // Attributes
    private String id;
    private String name;
    private int balance;

    // Constructor
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (amount <= balance){
            this.balance -= amount;
        } else {
            System.out.println("Amount exceed balance");
        }
        return balance;
    }

    // Method to transfer money
    public boolean transferTo(Account targetAccount, double amount){
        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
            targetAccount.balance += amount;
            return true;
        }
        return false;
    }   
}