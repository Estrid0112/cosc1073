package week10;

public class Account {
    //Attributes; Instance variables; Member fields
    private String id;
    private String name;
    private int balance;

    //Constructors
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Methods
    public String getId(){
        return id;
    }

    public void setId(String id){
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

    public void setBalance(int balance){
        this.balance = balance;
    }

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

    public String toString(){
        String myString = "";
        myString += "Account ID: " + this.id + "\n";
        myString += "Account name: " + this.name + "\n";
        myString += "Account balance: " + this.balance;
        return myString;
    }
}

