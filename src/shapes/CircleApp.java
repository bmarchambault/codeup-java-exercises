package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();//creates a new instance of the scanner object to capture the users information.

        System.out.println("Please input a number for a circle radius");
//need to make sure its a number - use the get double
        double radius = in.getDouble();//get double needs to get the users input with the scanner.
        //then create a new circle object using the constructor
        Circle c1 = new Circle(radius);
        System.out.println("Your circle has a radius of " + radius + ".");
        System.out.println("Your circle has a circumference of " + c1.getCircumference() + ".");
        //you created a new circle.  to get the circumference (which is a property of the new circle, use dot notation to access)
        System.out.println("Your circle has an area of " + c1.getArea() + ".");

    }
}
//create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)