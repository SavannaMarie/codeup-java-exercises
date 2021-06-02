package shapes;
import util.Input;

import java.text.DecimalFormat;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radiusInput = input.getDouble();
        Circle circle = new Circle(radiusInput);
        double circleArea = circle.getArea();
        double circleCircumference = circle.getCircumference();
        DecimalFormat f = new DecimalFormat("#.##");
        System.out.printf("Circle Radius: %s %nCircle Area: %s %nCircle Circumference: %s%n", radiusInput, f.format(circleArea), f.format(circleCircumference));
    }
}