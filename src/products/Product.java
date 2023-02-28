// Addison Farley
// SDEV 219
// Friday Lab- Inheritance

package products;

//Represents a sellable product
public class Product extends PlaceableItem
{
    private String productName;
    private double price;

    public Product(int aisle, String section, int row,
                   String productName, double price)
    {
        super(aisle, section, row);
        this.productName = productName;
        this.price = price;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Product - " + productName + " ($" + price + "), " + super.toString();
    }
}
