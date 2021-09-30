package week10;

public class Rectangle extends Shape implements Printable{
    private double height, width;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double computeArea(){
        return height * width;
    }

    public void printInfo(){
        System.out.println("I am a rectangle.");
    }

    public void drawShape(){
        System.out.println("***************");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("***************");

    }

}
