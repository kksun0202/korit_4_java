package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "빨강";
        car1.speed = 100;
        car1.drive();
        System.out.println(car1.brake());
        car1.displayInfo();
        car2.color = "노랑";
        car2.speed = 200;
        car2.drive();
        System.out.println(car2.brake());
        car2.displayInfo();
    }
}
