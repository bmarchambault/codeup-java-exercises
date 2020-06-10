public class Person {
    private String name;

    //constructor, this can be done over and over with different parameters
// use this to create a new person
    public Person(String personsName) {
        this.name = personsName;
    }

    //use the setter to CHANGE the name of a person.
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void sayHello() {
        System.out.println("Hello " + name);
    }
//this line is the entry point.  i can be up top under the class name or here below.
    public static void main(String[] args) {
        //test code here.  or make another class and incorporate this person data
    Person p1 = new Person("Joaquin");
//    p1.name = "joaquin";
        System.out.println(p1.getName());
        p1.sayHello();

    }
}







