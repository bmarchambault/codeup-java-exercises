package inheritanceLecture;

public class Jet extends Vehicle {
    private int maxAltitude;

    public Jet (boolean isOperable, int passengerCapacity, String powerSource, int maxAltitude){
        super(isOperable, passengerCapacity, powerSource);
        this.maxAltitude = maxAltitude;
    }

    public void turnOn(){
        System.out.println("Igniting jet engines...");
    }


    public void setMaxAltitude(int maxAltitude){
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude(){
      return this.maxAltitude;
    }

    public void takingOff(){
        System.out.println(this + "is taking off...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "is operable = " + isOperable +
                ", \n passenger capacity = " + passengerCapacity +
                ", \n power source = '" + powerSource + '\'' +
                ", \n maximum altitude of this jet = " + maxAltitude + '\'' +
                "} \n";
    }


}
