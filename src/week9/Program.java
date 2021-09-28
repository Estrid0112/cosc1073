package week9;
import week7.Account;

public class Program {
    public static void main(String[] args) {
        int[] myIntegers = new int[10];

        for (int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i] + " ");
        }
        System.out.println("\n");
        Account[] myObjects = new Account[10];
        myObjects[0] = new Account("s1234", "Joe", 1000);

        for (int i = 0; i < myObjects.length; i++){
            System.out.println(myObjects[i] + " ");
        }
        System.out.println("\n");
        myObjects[0] = null;
        for (int i = 0; i < myObjects.length; i++){
            System.out.println(myObjects[i] + " ");
        }
        Account account1 = new Account("s1234", "Joe", 1000);
        account1.withdraw(500);
        Account account2 = new Account("s2", "Estrid");
        StudentWithAccount myStudent = new StudentWithAccount("s1234567", "Estrid", account2);
        myStudent.withdrawFromAccount(500);
    }
}
