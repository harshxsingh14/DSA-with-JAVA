public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }

    public Car start() {
        int pop = 5;
        if (currentFuelInLiters == 0) {
            System.out.println(pop);
            System.out.println("Car is out of fuel, cannot start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }
        return this;
    }

    public void drive() {
        if (currentFuelInLiters <= 0) {
            System.out.println("No fuel left to drive.");
            return;
        }
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float litersToAdd) {
        this.currentFuelInLiters += litersToAdd;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    // Add this main method to test
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar);
        myCar.start();
        myCar.drive();
        myCar.addFuel(3);
        System.out.println("Fuel left: " + myCar.getCurrentFuelLevel());
    }
}
