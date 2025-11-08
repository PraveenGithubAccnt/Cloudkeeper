// ✅ Custom Exception
class InvalidPriceException extends Exception {
    InvalidPriceException(String message) {
        super(message);
    }
}

class Product {

    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) throws InvalidPriceException
    {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative!");
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------");
    }
}


public class ProductCatalog {
    public static void main(String[] args) {

        try {
            Product p1 = new Product(101, "Laptop", 55000);
            Product p2 = new Product(102, "Mobile", 20000);
            Product p3 = new Product(103, "Headphones", 1500);
//            Product p4 = new Product(104, "Keyboard", -500);

            p1.display();
            p2.display();
            p3.display();
//            p4.display();

        } catch (InvalidPriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
