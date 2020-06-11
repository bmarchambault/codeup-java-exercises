package util;
import java.util.Scanner;
//    Create a class named Input that has a private property named scanner.
public class Input {
    private  Scanner scanner;//private property of scanner
    //   When an instance of this object (Input object) is created,
    // the scanner property should be set to a new instance of the Scanner class.
    public Input(){//constructor for input
        this.scanner = new Scanner(System.in);//creates a new instance of the scanner property
    }

    //getter field (method for the scanner property)
    public Scanner getScanner(){
        return scanner;
    }
//    The class should have the following methods, all of which return command line input from the user:
    public String getString(){
        System.out.println("Please enter your name");
        String userName = this.scanner.next();
        System.out.println("You entered "+ userName + ".");
        return userName;
    }
    public boolean yesNo(){
        System.out.println( "Please enter \"y\" or \"yes\" to continue or \"n\" or \"no\" to exit.");
        String response = this.scanner.next();
        if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Thank you.");
            return true;
        }else{
            System.out.println("No problem");
            return false;
        }
    }
    public int getInt(int min, int max) {
        int userInputRangeInt;
        do {
            System.out.println("Please enter an number between " + min + " and " + max);
            userInputRangeInt = this.scanner.nextInt();
        } while ( userInputRangeInt < min || userInputRangeInt > max);
            System.out.println("Perfect!");
            return userInputRangeInt;
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userInputInt = this.scanner.nextInt();
        System.out.println("You entered " + userInputInt);
        return userInputInt;
    }

    public double getDouble(double min, double max){
        double userInputRangeDbl;
        do {
            System.out.println("Please enter an decimal number between " + min + " and " + max);
            userInputRangeDbl = this.scanner.nextDouble();
        } while ( userInputRangeDbl < min || userInputRangeDbl > max);
        System.out.println("Perfect!");
        return userInputRangeDbl;
    }

    public double getDouble(){
        System.out.println("Please enter a decimal number");
        double userInputDbl = this.scanner.nextDouble();
        System.out.println("You entered " + userInputDbl);
        return userInputDbl;
    }

//    public static void main(String[] args) {
//       Input user = new Input();
////       user.getString();
////       Input continue = new Input();
////       user.yesNo();
////       user.getInt(3, 15);
////       user.getInt();
//       user.getDouble(4.95, 100.50);
//       user.getDouble();
//    }
}
//Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//String getString()
//boolean yesNo()
//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
//
//Bonus
//
//Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.