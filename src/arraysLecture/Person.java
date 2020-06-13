package arraysLecture;

public class Person {

    private String firstName;
    private String lastName;

    //constructor, this can be done over and over with different parameters
// use this to create a new person
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //use the setter to CHANGE the name of a person. anther good use case would be to set a password.  this and the getter are the gate keepers of the accessing and manipulating the data.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLasttName(String LastName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    //because there are no set parameters, theres no difference between this.name and name.  but this.name is best practice in case two strings happen to be the same i.e. there's more than one Cathy
//    public String getName() {
//        return this.name;
//    }
//
//
//    public void sayHello() {
//        System.out.println("Hello " + this.name);
//    }
}
