abstract class Vehicle {
    protected String number, type;
    protected double rate;

    public Vehicle(String number, String type, double rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public abstract double cost(int days);
    public String getType() { return type; }
}

class Car extends Vehicle {
    public Car(String n, String t, double r) { super(n, t, r); }
    public double cost(int d) { return rate * d * 1.2; }
}

class Bike extends Vehicle {
    public Bike(String n, String t, double r) { super(n, t, r); }
    public double cost(int d) { return rate * d; }
}

class Truck extends Vehicle {
    public Truck(String n, String t, double r) { super(n, t, r); }
    public double cost(int d) { return rate * d * 1.5; }
}

interface Insurable {
    double insurance();
    String details();
}

class InsuredVehicle extends Vehicle implements Insurable {
    private String policy; private double insRate;

    public InsuredVehicle(String n, String t, double r, String p, double ir) {
        super(n, t, r); this.policy = p; this.insRate = ir;
    }

    public double cost(int d) { return rate * d; }
    public double insurance() { return rate * insRate; }
    public String details() { return "Policy " + policy + ", Rate " + insRate; }
}

class RentalSystem {
    public static void main(String[] a) {
        Vehicle[] v = {
            new Car("C101","Car",1000),
            new Bike("B202","Bike",300),
            new Truck("T303","Truck",2000),
            new InsuredVehicle("I404","Car",1200,"P999",0.1)
        };

        for (Vehicle x : v) {
            System.out.println(x.getType()+" Cost(5 days): "+x.cost(5));
            if (x instanceof Insurable) {
                Insurable i = (Insurable)x;
                System.out.println("Insurance: "+i.details()+" , Cost: "+i.insurance());
            }
        }
    }
}
