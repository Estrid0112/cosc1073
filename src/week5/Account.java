package week5;

public class Account {
    //Attributes; Instance variables; Member fields
    private String id;
    private String name;
    private int balance;

    //Constructors
    public Account(String id, String name, int balance){
        this(id, name);
        this.balance = balance;
    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String accountID, int balance){
        id = accountID;
        this.balance = balance;
    }

    public Account(){
        this.id = null;
        this.name = null;
        this.balance = 0;
    }

    //Methods
    public String getId(){
        return id;
    }

    public void setId(String id){
        // g123
        if (id.startsWith("s")) {
            this.id = id;
        }else{
            System.out.println("This new ID is not valid.");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBalance(){return balance; }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public boolean withdraw(int amount){
        boolean result = false;
        if ( balance >= amount ) {
            result = true;
            balance -= amount;
        }
        if (!result){
            System.out.println("Not enough balance!");
        }else{
            System.out.println("Remaining balance: " + balance);
        }
        return result;
    }

//    public boolean transfer(Account account, int amount) {
//        if (balance >= amount) {
//            balance = balance - amount;
//            account.balance += amount;
//            System.out.println("$" + amount + " has been transferred.");
//            return true;
//        }
//        System.out.println("Not enough balance!");
//        return false;
//    }

    public boolean transfer(Account account, int amount){
        boolean result = this.withdraw(amount);
        if (result){
            account.deposit(amount);
            return true;
        }else{
            System.out.println("The transfer is not successful due to insufficient balance.");
            return false;
        }
    }

//    public void transfer(Account account, int amount){
//        boolean result = this.withdraw(amount);
//        if (result){
//            account.deposit(amount);
//        }else{
//            System.out.println("The transfer is not successful due to insufficient balance.");
//        }
//    }



}
