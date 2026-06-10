package eksamen24;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle c1 = new Circle(50.3);
        Rectangle r1 = new Rectangle(10.2,4.4);
        Circle c2 = new Circle(540.73);
        Rectangle r2 = new Rectangle(6.3,6.1);

        shapes.add(c1);
        shapes.add(r1);
        shapes.add(c2);
        shapes.add(r2);

       for (Shape s : shapes) {
           System.out.println(s);

       }
    }
}
