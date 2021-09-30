package week10;

public class SavingsAccount extends Account implements Printable{
    private int minAmount;

    public SavingsAccount(String id, String name, int balance, int minAmount){
        super(id, name, balance);
        this.minAmount = minAmount;
    }

    public SavingsAccount(String accountID, String accountName, int amount)   {
        this(accountID,accountName,amount,0);
    }

    public int getMinAmount(){
        return minAmount;
    }

    public void addInterest(double rate){
        this.deposit((int)(getBalance() * rate / 100));
    }

    public boolean withdraw(int amount){
        System.out.println("Withdrawing from a Savings Account.");
        return true;
    }

    public void drawShape(){
        System.out.println("***************");
        System.out.println("*SavingsAccount*");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("***************");

    }
}
