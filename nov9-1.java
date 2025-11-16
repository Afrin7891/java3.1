public class Car {
    String color;
    int year;

    public void drive() {
        System.out.println("Driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.year = 2021;
        myCar.drive();  // “Driving…”
    }
}
