public class Person {
    private String name;

    //constructor, this can be done over and over with different parameters
// use this to create a new person
    public Person(String personsName) {
        this.name = personsName;
    }

    //use the setter to CHANGE the name of a person. anther good use case would be to set a password.  this and the getter are the gate keepers of the accessing and manipulating the data.
    public void setName(String name) {
        this.name = name;
    }

    //because there are no set parameters, theres no difference between this.name and name.  but this.name is best practice in case two strings happen to be the same i.e. there's more than one Cathy
    public String getName() {
        return this.name;
    }


    public void sayHello() {
        System.out.println("Hello " + this.name);
    }
//this line is the entry point.  i can be up top under the class name or here below.
    public static void main(String[] args) {
        //test code here.  or make another class and incorporate this person data
    Person p1 = new Person("Joaquin");
//    p1.name = "joaquin";
        p1.sayHello();

//        Understanding references
//
//The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//true
//        System.out.println(person1 == person2);//false

//        Person person1 = new Person("John");
//        Person person2 = person1;//reassigning value
//        System.out.println(person1 == person2);// will be true

//        Person person1 = new Person("John");
//        Person person2 = person1;//reassigning
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");//they'll both be jane, because reassignment gave them the same referencing.
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}







