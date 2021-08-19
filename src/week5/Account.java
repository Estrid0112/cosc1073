package week5;

public class Account {
    //Attributes
    private String id;
    private String name;
    private int balance;

    //Constructors
    public Account(String id, String name, int balance){
        this(id, name);
        this.balance = balance;
    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public Account(){
        this.id = null;
        this.name = null;
        this.balance = 0;
    }

    //Methods
    public String getId(){
        return id;
    }

    public void setId(String id){
        if (id.startsWith("s")) {
            this.id = id;
        }else{
            System.out.println("This new ID is not valid.");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBalance(){return balance; };

    public void deposit(int amount){
        this.balance += amount;
    }

}
