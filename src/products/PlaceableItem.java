// Addison Farley
// SDEV 219
// Friday Lab- Inheritance

package products;

//represents an item with a location at a store
public class PlaceableItem
{
    private int aisle;
    private String section;
    private int row;

    public PlaceableItem(int aisle, String section, int row)
    {
        this.aisle = aisle;
        this.section = section;
        this.row = row;
    }

    public int getAisle()
    {
        return aisle;
    }

    public String getSection()
    {
        return section;
    }

    public int getRow()
    {
        return row;
    }

    @Override
    public String toString()
    {
        return "Location: Aisle #" + aisle + ", Section " + section + ", Row #" + row;
    }
}
