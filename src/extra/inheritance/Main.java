package extra.inheritance;
//Vehicle class is the superclass while the Car and Bycicle classes are children classes.


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        System.out.println(car.speed);

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();
        System.out.println(bike.speed);

        System.out.println("Car doors " + car.doors);
        System.out.println("Bike pedals " + bike.pedals);
    }
}
