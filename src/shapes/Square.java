package shapes ;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public double getPerimeter() {
        return this.length * 4;
    }
    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }
}

