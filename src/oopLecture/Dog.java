package oopLecture;

public class Dog {
    public int age;
    public String name;
    public String breed;


  //you can call this method in the main.
    public void callForDog(String name){
        if (name.equalsIgnoreCase(this.name)){
            System.out.println(this.name + " is now walking towards you!");
        }else{
            System.out.println(this.name + " ignores you.");
        }
    }

}
