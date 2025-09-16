abstract class Product {
    protected String id, name;
    protected double price;

    public abstract double discount();
    public abstract double tax();

    public double finalPrice() { return price + tax() - discount(); }
}

class Electronics extends Product {
    private double discRate, taxRate;
    public Electronics(String id, String name, double price, double discRate, double taxRate) {
        this.id=id; this.name=name; this.price=price; this.discRate=discRate; this.taxRate=taxRate;
    }
    public double discount() { return price * discRate; }
    public double tax() { return price * taxRate; }
}

class Clothing extends Product {
    private double discRate, taxRate;
    public Clothing(String id, String name, double price, double discRate, double taxRate) {
        this.id=id; this.name=name; this.price=price; this.discRate=discRate; this.taxRate=taxRate;
    }
    public double discount() { return price * discRate; }
    public double tax() { return price * taxRate; }
}

class Groceries extends Product {
    private double taxRate;
    public Groceries(String id, String name, double price, double taxRate) {
        this.id=id; this.name=name; this.price=price; this.taxRate=taxRate;
    }
    public double discount() { return 0; }
    public double tax() { return price * taxRate; }
}

public class ECommerceProcessor {
    public static void main(String[] args) {
        Product[] items = {
            new Electronics("E1","Laptop",50000,0.1,0.18),
            new Clothing("C1","Shirt",2000,0.2,0.05),
            new Groceries("G1","Rice",1000,0.02)
        };
        for (Product p : items)
            System.out.println(p.name+" Final Price: "+p.finalPrice());
    }
}
