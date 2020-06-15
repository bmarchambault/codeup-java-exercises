package inheritanceLecture;

public class VehicleTest {
    //create a method that turn on all vehicles:
    public static void turnOnVehicles (Vehicle[]vehicles) {
        for (Vehicle all : vehicles) {
            all.turnOn();
        }

    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(true, 5, "gas");

//these are n/a now because the constructor changed
//        Car c1 = new Car();
//        Jet j1 = new Jet();

//        c1.setOperable(false);
//        c1.setPassengerCapacity(8);
//        c1.setPowerSource("gas");
//
//        j1.setOperable(true);
//        j1.setPassengerCapacity(12);
//        j1.setPowerSource("kerosene");


//to instantiate a new object now:
        Car c1 = new Car(false, 8, "gas", 24);
        Jet j1 = new Jet(true, 12, "kerosene", 74_000);

//create a array of all objects, type of vehicle:
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = v1;
        vehicles[1] = c1;
        vehicles[2] = j1;

//call to turn on all vehicles:
        turnOnVehicles(vehicles);




        System.out.println(v1.toString());
        System.out.println(c1.toString());
        System.out.println(j1.toString());
    }

}
