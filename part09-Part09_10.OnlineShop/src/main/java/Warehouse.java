import java.util.*;

public class Warehouse {

    private Map<String, Integer> productsAndPrices; // holds the name and price of a product
    private Map<String, Integer> productsAndStocks; // holds the name and stock of a product

    public Warehouse() {

        productsAndPrices = new HashMap<String, Integer>();
        productsAndStocks = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stock) {

        productsAndPrices.put(product, price);
        productsAndStocks.put(product, stock);

    }

    public int price(String product) {

        if (productsAndPrices.containsKey(product)) {
            return productsAndPrices.get(product);
        }

        return -99;
    }

    public int stock(String product) {

        if (productsAndStocks.containsKey(product)) {
            return productsAndStocks.get(product);
        }

        return 0;

    }

    public boolean take(String product) {

        if (productsAndStocks.containsKey(product) && (productsAndStocks.get(product) > 0)) {

            productsAndStocks.put(product, productsAndStocks.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {

        return productsAndStocks.keySet();

    }
}
