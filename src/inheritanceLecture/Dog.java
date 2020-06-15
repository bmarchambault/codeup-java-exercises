package inheritanceLecture;

public class Dog extends Animal {
//    //if you want access to animal methods including the constructor, make sure the Animal class (parent class) is protected or   public

//    ==================CONSTRUCTORS================================
//    //create an empty default constructor in the animal class
//    OR
    // create a constructor that uses the parent constructor.  and you can add properties specific to this object like the breed
    public Dog(String species, int age, String breed){
        super(species, age);
        this.breed = breed;
    }
//    alternatively:
//public Dog( String breed){
//        super("Canine", 9);//hard coding values
//        this.breed = breed;//adding child specific property
//    }
//    also alternately - but not best practice because these hard code values don't apply to all dogs
//public Dog(){
//        super("Canine", 9);//hard coding values
////        this.breed = german sheppard;//adding hard coded values child specific property
//    }
 //====================================================================================
//    //then create a dog object in the main method (AnimalTest).


    //to add a new property that is on on the parent class:
    private String breed;

//==========GETTERS AND SETTERS CHILD SPECIFIC===========================
    public String getBreed() {
        return this.breed;
    }
    public void setBreed (String breed) {
        this.breed = breed;
    }
//====================METHODS===================
    @Override//override annotation
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age + '\'' +
                ", breed = " + breed + '\'' +
                '}';
    }

    //overriding the parent method - use an override annotation
    @Override
        public void makeNoise() {
            System.out.println("BARK bark bark.");
        }
        //or method overload the parent method:
    public void makeNoise(String noise){
        System.out.println(noise);
    }
        //using the parent method:
    public void makeParentNoise(){
        super.makeNoise();
    }

//
//
//
//
////    private String species;// duplicate code from parent
////    private int age;
//
//
////    public String getSpecies() {
////        return species;
////    }
////
////    public void setSpecies(String species) {
////        this.species = species;
////    }
////
////    public int getAge() {
////        return age;
////    }
//
////    public void setAge(int age) {
////        this.age = age;
////    }
//
//

    }

