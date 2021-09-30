package week10;

public abstract class Shape {
    public String color;
    protected String name;

    public abstract void printInfo();
    public abstract double computeArea();

    public void printHello(){
        System.out.println("Hello World!");
    }


}
