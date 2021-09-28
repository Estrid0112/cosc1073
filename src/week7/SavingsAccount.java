package week7;

public class SavingsAccount extends Account{
    private int minAmount;

    public SavingsAccount(String id, String name, int balance, int minAmount){
        super(id, name, balance);
        this.minAmount = minAmount;
    }
    public SavingsAccount(){
        super();
        this.minAmount = 0;
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
        boolean result = false;
        int balance = getBalance();
        if (balance >= amount && balance - amount >= minAmount) {
            result = true;
            setBalance(balance - amount);
        }
        if (!result){
            System.out.println("Not enough balance! You need to maintain the minimum amount threshold.");
        }else{
            System.out.println("Remaining balance: " + getBalance());
        }
        return result;
    }

    public void print(){
        super.print();
        System.out.println("Account minimum amount: " + this.minAmount);
    }


    public static void main(String[] args) {
//        SavingsAccount account = new SavingsAccount();
//        SavingsAccount account2 = new SavingsAccount("123", "Mary", 1000, 0);
        SavingsAccount account2 = new SavingsAccount("123", "Mary", 1000);
        SavingsAccount account3 = new SavingsAccount("123", "Mary", 1000, 100);
//        System.out.println(account.id);
    }

}
