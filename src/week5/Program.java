package week5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account account = new Account("s123","Mercy Brown",1000);
        Account s234 = new Account("s234","David Brown",2000);
        s234.deposit(1000);
        account.deposit(120);
        System.out.println(account.getBalance());
        System.out.println(s234.getBalance());

        account.withdraw(120);
        account.withdraw(1100);

        boolean result = account.transfer(s234, 1000);
        account.transfer(s234, 1);



        account.setId("s3457876w");
        System.out.println(account.getId());
//        Account account2 = new Account();
//        Account account3 = new Account("s234", "Estrid");
//
//        System.out.println(account.getBalance());
//        account.deposit(500);
//        //account.setId("g123");
//        //System.out.println(account.getId());
//        System.out.println(account.getBalance());
    }
}
