package inheritanceMiniExercise;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(true, 5, "gas");
        Car c1 = new Car();
        Jet j1 = new Jet();


        c1.setOperable(false);
        c1.setPassengerCapacity(8);
        c1.setPowerSource("gas");

        j1.setOperable(true);
        j1.setPassengerCapacity(12);
        j1.setPowerSource("kerosene");


        System.out.println(v1.toString());
        System.out.println(c1.toString());
        System.out.println(j1.toString());
    }


}
