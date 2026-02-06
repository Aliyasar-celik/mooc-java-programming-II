import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<Item> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<Item>();

    }

    public void add(String product, int price) {

        Item itemToAdd = new Item(product, 1, price);

        if (this.cartItems.contains(itemToAdd)) {
            int indexOfItemToAdd = cartItems.indexOf(itemToAdd);
            this.cartItems.get(indexOfItemToAdd).increaseQuantity();
        } else {
            cartItems.add(itemToAdd);
        }
    }

    public int price() {
        int cartPrice = 0;

        for (Item item : this.cartItems) {

            cartPrice += item.price();
        }

        return cartPrice;
    }

    public void print() {

        for (Item item : cartItems) {

            System.out.println(item);
        }

    }
}
