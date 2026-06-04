package eksamen11;

public class Product {
    private String name;
    private int price;
    private int stockQuantity;

    public Product(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int  getStockQuantity() {
        return stockQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void reduceStock(int amount) {
        if (stockQuantity - amount < 0) {
            stockQuantity = 0;
        } else {
            stockQuantity = stockQuantity - amount;
        }
    }


    @Override
    public String toString() {
        return name + " - " + price + "kr - " + stockQuantity + " På lager";
    }
}
