package week10;

public class Triangle extends Shape implements Printable{
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Triangle(){
        this.base = 0;
        this.height = 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double computeArea(){
        return height * base * 0.5;
    }

    public void printInfo(){
        System.out.println("I am a triangle.");
    }

    public void drawShape(){
        System.out.println("       *      ");
        System.out.println("    *     *   ");
        System.out.println("  *         *  ");
        System.out.println("*             *");
        System.out.println("***************");
    }
}
