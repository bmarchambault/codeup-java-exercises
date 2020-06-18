package arraysLecture.arraysBonus;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBonusGroceryList {
    public static void main(String[] args) {
        Input in = new Input();



        boolean makeGroceryList = in.yesNo("Would you like to create a grocery list?");
        if (makeGroceryList == true) {

            int arrayLength = in.getInt("How many items are on your list?");
            GroceryItem[] groceryItemsArray = new GroceryItem[arrayLength];
            System.out.println("There will be " + groceryItemsArray.length + "item's in this list.");
            int arrayLengthCounter = 0;
            do {
                for ( int index = 0; index <= groceryItemsArray.length -1; index++) {

                    String itemName = in.getWord("Enter an item");
                    String itemCategory = in.getWord("What category is " + index + "?");
                    int numOfItems = in.getInt("How many of this item do you need?");
                    groceryItemsArray[index] = new GroceryItem(itemName, itemCategory, numOfItems);
                    arrayLengthCounter++;

                }
            } while(arrayLengthCounter < groceryItemsArray.length);

            for(GroceryItem groceryItem: groceryItemsArray){
                System.out.println(groceryItem.getItemName() + groceryItem.getItemCategory() + groceryItem.numOfItems);
            }
            System.out.println(groceryItemsArray.length);
        }



    }
}



//}
//1. Create a command line grocery list maker
//
//    - before prompting the user to enter each item, ask how many items will be
//      entered √
//    - for each item, the user should be prompted to enter in the name, quantity,
//      and category of each grocery item
//    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
//      objects to store in an array
//    - once the user has entered all items, print out all items grouped by
//      category and alphabetized in each group