package inheritanceMiniExercise;

public class Vehicle {
    protected boolean isOperable;
    protected int passengerCapacity;
    protected String powerSource;

    protected Vehicle(){

    }

    protected Vehicle(boolean isOperable, int passengerCapacity, String powerSource){
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public String getPowerSource(){ return this.powerSource; }

    public boolean getIsOperable() { return this.isOperable; }

    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }

    public void setPowerSource(String powerSource){
        this.powerSource = powerSource;
    }

    public void setOperable (boolean isOperable) { this.isOperable = isOperable;}

    public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "is operable = " + isOperable +
                ", \n passenger capacity = " + passengerCapacity +
                ", \n power source = '" + powerSource + '\'' +
                "} \n";
    }
}
// !! MINI-EXERCISE 1 !!
//Create a Vehicle class:
//  - add the following private properties:
//    1. boolean isOperable (intended to describe if the vehicle is functional or broken)
//    2. int passengerCapacity (intended to describe how many people it can transport)
//    3. String powerSource (intended to describe how the vehicle is powered, e.g. "gas", "electric", "nuclear", "human-effort", etc.)
//  - add getters and setters for all properties, an empty constructor, and a constructor that sets all fields
//Create a Car class that extends Vehicle (no need to add anything to it yet)
//Create a Jet class that extends Vehicle (no need to add anything to it yet)
//Create a VehicleTest class
//  - add a main method and create a Vehicle, Jet, and Car object, setting values for each and testing out the output of .toString() method for each

//-- !! MINI-EXERCISE 2 !!
//In your Car class, add the following:
//  - private int property for milesPerGallon √
//  - a constructor that calls the vehicle constructor to set all of the inherited fields and sets the milesPerGallon √
//  - add getters and setters for milesPerGallon √
//  - add a void deploy AirBag() that will sout a message "Deploying airbag..." √
//  - add a .toString() method with IntelliJ √
//In your Jet class, add the following:
//  - private int property for maximumAltitude √
//  - add a void method takeOff() that will sout a message "Taking off..." √
//  - a constructor that calls the vehicle constructor to set all of the inherited fields and sets the maximumAltitude √
//  - add getters and setters for maximumAltitude √
//  - add a .toString() method with IntelliJ