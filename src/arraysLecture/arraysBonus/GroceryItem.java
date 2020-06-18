package arraysLecture.arraysBonus;

public class GroceryItem {
    protected String itemName;
    protected String itemCategory;
    protected int   numOfItems;

//    public GroceryItem(){};

    public GroceryItem(String itemName, String itemCategory, int numOfItems){
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.numOfItems = numOfItems;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }
}
