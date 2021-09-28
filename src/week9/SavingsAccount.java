package week9;
import week7.Account;


public class SavingsAccount extends Account{
    private double intRate;
    private double minAmount;

    public SavingsAccount(String id, String name){
//        super();
        super(id, name);
        this.intRate = 0.0;
        this.minAmount = 0.0;
    }
}
