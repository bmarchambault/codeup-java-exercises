public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.setProperties("Home-style Burger", 6.00, false, false);
//        dish1.name = "Home-style Burger";
//        dish1.cost = 6.00;
//        dish1.special = false;

        Dish dish2 = new Dish();
        dish2.setProperties("Seafood Pasta", 5.00, true, false);
//        dish2.name = "Seafood Pasta";
//        dish2.cost = 5.00;
//        dish2.special = true;

        Dish k1 = new Dish();
        k1.setProperties("Chicken Tenders", 3.00, false, true);
//        k1.name = "Chicken Tenders";
//        k1.cost = 3.00;
//        k1.kidsMenu = true;

        Dish dish3 = new Dish();
        dish3.setProperties("salad", 6.00, false, false);
//        dish3.name = "Salad";
//        dish3.cost = 6.00;
//        dish3.special = false;

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();
        k1.printSummary();



    }

}
//Create a class called Dish. This class will represent various restaurant dishes.
//Include an integer property called "costInCents"
//Include a string property called "nameOfDish"
//Include a boolean property called "wouldRecommend"
//Include a method called "printSummary" with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//      Cost: COST_IN_CENTS_HERE
//      Name: NAME_OF_DISH_HERE
//      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//Create another class called DishTest
//Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed



//================================dish part 2==========================
// PART 1
//    Refactor your Dish and DishTest classes...
//      1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//      2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//      3) Refactor code as needed in DishTest to access and modify dish object property values
//      4) Add a constructor method to Dish that will assign all properties
//      5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
//  PART 2
//    Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000
//      - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//      - analyzeDishCost() - that takes in a Dish object and will print out either "More expensive than average" or "Less expensive than average", depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//    Try out the DishTools methods with Dish objects in the DishTest main method