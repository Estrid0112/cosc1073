package week9;
import week7.Account;

public class StudentWithAccount {
    private String id;
    private String name;
    private Account account;

    public StudentWithAccount(String id, String name, Account account){
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public boolean withdrawFromAccount(int amount){
        return this.account.withdraw(amount);
//        int remaining = this.account.getBalance() - amount;
//
//        this.account.setBalance(remaining);
//        return true;
    }

}
