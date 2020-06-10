public class Dish {
 private String name;
 private double cost;
 private boolean special;
 private boolean kidsMenu;

public void printSummary(){
 if(this.special == true){
 System.out.printf("The %s is one of our specials for $" + "%.2f. \n" , name, cost);
} else if(this.kidsMenu == true) {
  System.out.printf("%s is one of our kids menu items.  It costs $" + "%.2f. \n" , name, cost);
 } else {
  System.out.printf("The %s costs $" + "%.2f. \n" , name, cost);
 }
 System.out.println("Would you like to add that to your order today?");
 }
 public String getName(){
 return this.name;
 }
//THIS IS WRONG.  REFACTOR THIS CODE AND USE A CONSTRUCTOR TO CREATE A NEW INSTANCE FIRST.
 //SETTERS ARE USED ONLY TO CHANGE PROPERTIES.
 public void setProperties(String name, double cost, boolean special, boolean kidsMenu){
 this.name = name;
 this.cost = cost;
 this.special = special;
 this.kidsMenu = kidsMenu;
 }

}
