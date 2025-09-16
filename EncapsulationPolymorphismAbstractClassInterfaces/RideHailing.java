interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle implements GPS {
    private String id, driver, location;
    private double rate;

    public Vehicle(String id, String driver, double rate, String location) {
        this.id = id; this.driver = driver; this.rate = rate; this.location = location;
    }

    public abstract double calculateFare(double km);

    public String getDetails() {
        return id + " | Driver: " + driver + " | Rate/km: " + rate + " | Location: " + location;
    }

    public double getRate() { return rate; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

class Car extends Vehicle {
    public Car(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    public double calculateFare(double km) { return km * getRate(); }
}

class Bike extends Vehicle {
    public Bike(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    public double calculateFare(double km) { return km * getRate() * 0.8; }
}

class Auto extends Vehicle {
    public Auto(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    public double calculateFare(double km) { return km * getRate() + 10; }
}

public class RideHailing {
    public static void showFare(Vehicle v, double km) {
        System.out.println(v.getDetails());
        System.out.println("Fare for " + km + " km: ₹" + v.calculateFare(km));
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C101", "Rajesh", 15, "MG Road");
        Vehicle bike = new Bike("B202", "Amit", 10, "Brigade Road");
        Vehicle auto = new Auto("A303", "Suresh", 12, "Koramangala");

        showFare(car, 10);
        showFare(bike, 10);
        showFare(auto, 10);

        car.updateLocation("Whitefield");
        System.out.println("Car moved to: " + car.getCurrentLocation());
    }
}
