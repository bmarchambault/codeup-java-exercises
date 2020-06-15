package inheritanceLecture;

public class Animal {
    //can create animal objects
    protected String species;
    protected int age;

    public Animal(String species, int age) {//use this in the child classes and you can add properties in the child that are specific to child as needed.
        this.species = species;
        this.age = age;
    }

//    public Animal(){}//empty animal constructor - you dont always need this

    public String getSpecies() { return species; }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("This animal is making some noise...");
    }



    //we can overload this in the dog class
        @Override
        public String toString() {
            return "Animal{" +
                    "species='" + species + '\'' +
                    ", age=" + age +
                    '}';
    }

}
