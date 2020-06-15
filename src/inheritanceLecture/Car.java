package inheritanceLecture;

public class Car extends Vehicle {
    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon){
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public void turnOn(){
        System.out.println("Cranking engine...");
    }


public void setMilesPerGallon(int milesPerGallon){
        this.milesPerGallon = milesPerGallon;
}

public int getMilesPerGallon(){
       return this.milesPerGallon;
}

public void deplyAirBag(){
    System.out.println("Deploying airbag...");
}

    @Override
    public String toString() {
        return "Vehicle{" +
                "is operable = " + isOperable +
                ", \n passenger capacity = " + passengerCapacity +
                ", \n power source = '" + powerSource + '\'' +
                ", \n miles per gallon = " + milesPerGallon + '\'' +
                "} \n";
    }



}
