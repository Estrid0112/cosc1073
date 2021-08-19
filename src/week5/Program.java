package week5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account account = new Account("s123","Mercy Brown",1000);
        Account account2 = new Account();
        Account account3 = new Account("s234", "Estrid");

        System.out.println(account.getBalance());
        account.deposit(500);
        //account.setId("g123");
        //System.out.println(account.getId());
        System.out.println(account.getBalance());
    }
}
