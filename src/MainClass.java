class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public double calculateResaleValue() {
        return 0.8 * price;
    }

    public double getPrice() {
        return price;
    }
}

class Car extends Vehicle {
    private int numDoors;
    private boolean isSedan;

    public Car(String make, String model, int year, double price, int numDoors, boolean isSedan) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.isSedan = isSedan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Is Sedan: " + isSedan);
    }

    @Override
    public double calculateResaleValue() {
        return 0.7 * getPrice();
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, double price, double loadCapacity) {
        super(make, model, year, price);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    public double calculateResaleValue() {
        return 0.6 * getPrice();
    }
}

class Motorcycle extends Vehicle {
    private boolean hasFairing;

    public Motorcycle(String make, String model, int year, double price, boolean hasFairing) {
        super(make, model, year, price);
        this.hasFairing = hasFairing;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Fairing: " + hasFairing);
    }

    @Override
    public double calculateResaleValue() {
        return 0.5 * getPrice();
    }
}

public class MainClass {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 25000.0, 4, true);
        Vehicle truck = new Truck("Ford", "F-150", 2018, 35000.0, 2.5);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2019, 15000.0, true);

        car.displayInfo();
        System.out.println("Resale Value: $" + car.calculateResaleValue());
        System.out.println();

        truck.displayInfo();
        System.out.println("Resale Value: $" + truck.calculateResaleValue());
        System.out.println();

        motorcycle.displayInfo();
        System.out.println("Resale Value: $" + motorcycle.calculateResaleValue());
    }
}
