package eksamen11;

import java.util.ArrayList;

public class ProductTest {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("lego bionicle", 50,2));
        products.add(new Product("lego pp", 30,21000));
        products.add(new Product("lego vv", 550,5));
        products.add(new Product("lego aa", 5000,6));


        products.get(1).reduceStock(50);
        System.out.println(products.get(1));

        products.get(0).reduceStock(1);
        System.out.println(products.get(0));
    }
}
