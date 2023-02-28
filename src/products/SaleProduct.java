// Addison Farley
// SDEV 219
// Friday Lab- Inheritance

package products;

//represents a product that can be on sale
public class SaleProduct extends Product
{
    private boolean currentlyOnSale;
    private double discountPercentage;

    public SaleProduct(int aisle, String section, int row,
                       String productName, double price,
                       boolean currentlyOnSale, double discountPercentage)
    {
        super(aisle, section, row, productName, price);
        this.currentlyOnSale = currentlyOnSale;
        this.discountPercentage = discountPercentage;
    }

    public SaleProduct(int aisle, String section, int row,
                       String productName, double price)
    {
        super(aisle, section, row, productName, price);
        this.currentlyOnSale = false;
        this.discountPercentage = 0;
    }

    public boolean isCurrentlyOnSale()
    {
        return currentlyOnSale;
    }

    public double getDiscountPercentage()
    {
        return discountPercentage;
    }

    @Override
    public String toString()
    {
        if(currentlyOnSale)
        {
            return super.toString() + ", On sale (" + discountPercentage * 100 + "% off)";
        }
        else
        {
            return super.toString() + ", Not on sale";
        }
    }
}

