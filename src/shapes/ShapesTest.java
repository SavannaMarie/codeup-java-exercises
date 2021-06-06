package shapes;
public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5.0, 4.0);
//        System.out.println("Rectangle perimeter: " + box1.getPerimeter());
//        System.out.println("Rectangle area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5.0);
//        System.out.println("Square perimeter: " + box2.getPerimeter());
//        System.out.println("Square area: " + box2.getArea());

        Measurable myShape1 = new Rectangle(5.0,4.0);
        System.out.println("Rectangle perimeter: " + myShape1.getPerimeter());
        System.out.println("Rectangle area: " + myShape1.getArea());
        System.out.println("====================");
        Measurable myShape2 = new Square(5);
        System.out.println("Square perimeter: " + myShape2.getPerimeter());
        System.out.println("Square area: " + myShape2.getArea());



    }
}
