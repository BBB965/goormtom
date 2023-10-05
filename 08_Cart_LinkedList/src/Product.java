public class Product {
    private long code;
    private String name;
    private int price;

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    Product(long code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}
