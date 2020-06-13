package arraysLecture;


public class Car {
    public Car(){
        System.out.println("Here's a car!");
    }
    private String make;
    private String model;
    private int year;

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void drive(){
        System.out.println("Thump thump..?");
    }
}