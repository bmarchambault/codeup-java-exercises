package abstractLecture;

abstract class Appliance {
 String model;
 String serialNum;
  String brand;

  public Appliance(){};
    public Appliance(String model, String serialNum, String brand){
        this.model = model;
        this.serialNum = serialNum;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public abstract void makeSound();
    public abstract void doWork();

//#### Mini-Exercise 2 (Abstract Classes)
//- Create an abstract class called Appliance with the following properties:
//    - package-private brand;
//    - package-private color;
//    - an empty constructor and a constructor that sets the properties.
//    - getters and setters for properties.
//    - an abstract method named makeSound() - when implemented, prints the sound the appliance makes
//    - an abstract method named doWork()- when implemented, prints what the appliance does
// - Create a concrete class of Refrigerator that extends Appliance. Implement all abstract methods.
// - Create a concrete class of Blender that extends Appliance. Implement all abstract methods.
// - Come up with your own concrete class to extend Appliance and implement abstract methods.











}
