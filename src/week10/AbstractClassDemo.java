package week10;

public class AbstractClassDemo {

    public static void printArea(Shape shape){
        System.out.println(shape.computeArea());
    }
    public static void main(String[] args) {
        Shape shape;
        // Cannot initialize an object of an abstract class
//        Shape shape = new Shape();
        // However, you can initialize it to a concrete class that extends the abstract class.
        shape = new Rectangle(1.0, 2.0);
        //Polymorphic way
        System.out.println(shape.computeArea());
        // We won't be able to invoke the method that does not belong to the Shape class
        // shape.draw();

        // Traditional way
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(1.0);
        rectangle.setHeight(2.0);
        System.out.println(rectangle.computeArea());
        rectangle.drawShape();

        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(1.0, 2.0);
        shapes[1] = new Rectangle(2.0, 2.0);
        shapes[2] = new Triangle(3.0, 3.0);
        shapes[3] = new Triangle(4.0, 4.0);

        for (int i = 0; i< 4; i++){
            System.out.println(shapes[i].computeArea());
        }

        printArea(rectangle);

    }
}
