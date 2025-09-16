abstract class FoodItem {
    protected String name;
    protected double price;
    protected int qty;

    public FoodItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public abstract double total();

    public void show() {
        System.out.println(name + " | Price: " + price + " | Qty: " + qty + " | Total: " + total());
    }
}

class VegItem extends FoodItem {
    public VegItem(String n, double p, int q) { super(n, p, q); }
    public double total() { return price * qty; }
}

class NonVegItem extends FoodItem {
    private double extra;

    public NonVegItem(String n, double p, int q, double e) {
        super(n, p, q);
        this.extra = e;
    }

    public double total() { return (price + extra) * qty; }
}

interface Discountable {
    void apply(double percent);
    String info();
}

class DiscountedItem extends FoodItem implements Discountable {
    private double discount;

    public DiscountedItem(String n, double p, int q, double d) {
        super(n, p, q);
        this.discount = d;
    }

    public double total() { return price * qty * (1 - discount / 100); }
    public void apply(double d) { this.discount = d; }
    public String info() { return "Discount: " + discount + "%"; }
}

class FoodOrder {
    public static void main(String[] a) {
        FoodItem[] items = {
            new VegItem("Salad", 50, 2),
            new NonVegItem("Chicken", 150, 3, 20),
            new DiscountedItem("Pizza", 200, 2, 10)
        };

        for (FoodItem f : items) {
            f.show();
            if (f instanceof Discountable) {
                Discountable d = (Discountable) f;
                System.out.println(d.info());
            }
        }
    }
}
