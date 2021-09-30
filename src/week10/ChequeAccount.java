package week10;

class ChequeAccount extends Account
{
    private double overdraftLimit;
    private double overdrawn;
    private int numTransactions;

    public ChequeAccount(String accountID, String name, int balance, double overdraftLimit)
    {
        super(accountID, name, balance);
        this.overdraftLimit = overdraftLimit;
        // overdrawn and numTransactions automatically initialised to 0
    }

    // no overdraftLimit
    public ChequeAccount(String accountID, String name, int balance)
    {
        // call full constructor but with 0 overdraftLimit
        this(accountID, name, balance, 0);
    }

    @Override
    public boolean withdraw(int amount)
    {
        System.out.println("Withdrawing from a Cheque Account.");
        return true;
    }


    @Override
    public void deposit(int amount)
    {
        System.out.println("Depositing into a ChequeAccount.");
    }

    public double getAvailableFunds()
    {
        return getBalance() + (overdraftLimit - overdrawn);
    }

    // since it not used anywhere we make it available to client (and remove unused compile warning)
    public int getNumTransactions()
    {
        return numTransactions;
    }

    // Dummy method for applying charge
    public void applyCharge(int charge){
        System.out.println("Applying charge to the ChequeAccount.");
    }

    @Override
    public String toString()
    {
        // use super.toString() and add a few extra attributes
        return String.format("ChequeAccount: %s, overdrawn=%.2f, overdraftLimit=%.2f",
                super.toString(), overdrawn, overdraftLimit);
    }
}

