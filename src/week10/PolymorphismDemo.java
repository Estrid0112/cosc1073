package week10;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Account account1;
        account1 = new SavingsAccount("0001", "Estrid", 0);
        // It will invoke the method of the subclass
        account1.withdraw(1000);
        // We cannot invoke methods that do not belong to superclass Account;
//        account1.addInterest();


        // Example of instanceof
        if (account1 instanceof Account){
            System.out.println("Account1 has the Class type of Account.");
        }

        Account[] accounts = new Account[3];
        accounts[0] = new Account("001", "Estrid", 0);
        accounts[1] = new SavingsAccount("002", "YuCheng", 0);
        accounts[2] = new ChequeAccount("003", "Anson", 0);

        for (int i = 0; i < 3; i++){
            // withdraw can be invoked, but the actual method got invoked depends on the actual data type
            accounts[i].withdraw(500);
        }

        // accounts[1] has SavingsAccount data type
        accounts[0].transfer(accounts[1], 500);
        // accounts[2] is a ChequeAccount, and accounts[1] is a SavingsAccount.
        // Again, the method that gets invoked depends on the actual data type.
        accounts[1].transfer(accounts[2], 500);

    }
}
