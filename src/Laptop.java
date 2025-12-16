public class Laptop {
    String brand;
    int price;
    Laptop () {
        brand = "Unknown";
        price = 0;
    }
    Laptop (String brand , int price ) {
        this.brand = brand;
        this.price = price;
    }
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop ();
    Laptop l2 = new Laptop ("Dell ", 55000);
    l1.showDetails();
    l2.showDetails();


    }
}
