package week6;

import week5.Account;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Account [] accs = new Account[5];
        accs[0] = new Account("s123","Mercy",1000);
        accs[1] = new Account("s234","David",2000);
        accs[2] = new Account("s456","Daryl",1500);
        accs[3] = new Account("s111","Jenny",2000);
        accs[4] = new Account("s234","David",2000);
        String id;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account id to display: ");
        id = sc.nextLine();

        for (int i = 0; i < accs.length; i++)
        {
            if (accs[i].getId().equals(id))
            {
                System.out.println("Matching account found!");
                System.out.println("ID: " + accs[i].getId());
                System.out.println("Name: " + accs[i].getName());
                System.out.println("Balance: " +
                        accs[i].getBalance());
            }

            // if the loop has reached the last object in the
            // array and it was not a match then the search has
            // failed
            else if (i == accs.length - 1)
            {
                System.out.println("ID " + id + " not found!");
            }
        }

    }
}
