package week8;
import week7.Account;
import week7.SavingsAccount;

public class Polymorphism {

    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("a12345","Charles",1000);
        accounts[1] = new SavingsAccount("s12346","Craig",1200,1000);

//        for (int i=0; i<3; i++) {
////            if (accounts[i].getType() == "Account"){
////                accounts[i].withdraw(500);
//            }
//            else if (accounts[i] instanceof SavingsAccount){
//                ((SavingsAccount) accounts[i]).withdraw(500);
//            }
//        }

    }
}
