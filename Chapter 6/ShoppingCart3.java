import java.text.NumberFormat;
import java.util.ArrayList;
public class ShoppingCart3
{
    private double totalPrice; // total price of items in the cart
    private ArrayList <Item> cart;
    // -----------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart3()
    {
        totalPrice = 0.0;
        cart = new ArrayList <Item>();

    }
    // -------------------------------------------------------
    // Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity){
        cart.add(new Item (itemName, price, quantity));
        totalPrice += (price * quantity);
    }

    // -------------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < cart.size(); i++){
            contents += cart.get(i) +"\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
}