//package arraysLecture;
//
//import java.util.Arrays;
//import java.util.ArrayList;
//
//public class ArraysLecture {
//
//    public static void main(String[] args) {
//
////        String[] planets = new String[8];
//        //or initialize:
//        int numberOfPlanets = 8;
//        String[] planets = new String[numberOfPlanets];
//
//        System.out.println(planets.length);//prints a number
//        System.out.println(planets[0]);//zero based index.  right now, its going to say null because our array is empty.  need to assign values.
//        planets[0]= "Mercury";
//        planets[7]= "Neptune";
////        you can just :  planets[8] = "Pluto" and expect a new index to be created because we defined the array to have 7 indexes.  we'll get a compile error saying out of bounds.
////
////===============================================================================
//// if we know the values of the objects we can use an array initializer (array literal)
//        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////==================================================================================
//      for(int x: myNumbers){
//            ++x;
//            System.out.println(x);
//        }
////
//        int[] otherNumbers = {5,4,3,2,1};
//        Arrays.sort(otherNumbers);
//        System.out.println(Arrays.toString(otherNumbers));
//
//        System.out.println(Arrays.equals(myNumbers,otherNumbers));
////
//////        create an Array containing Person objects
//        Person justin = new Person("Justin", "Reich");
////
//        Person[] instructors = new Person[2];
//////        Person[] instructors = {new Person(), new Person(), new Person()};
//        instructors[0] = justin;
//        instructors[1] = new Person("Sophie","K");
//        System.out.println(Arrays.toString(instructors));
//
//        Person[] oneMoreInstructor = Arrays.copyOf(instructors,instructors.length + 1);
//        System.out.println(Arrays.toString(oneMoreInstructor));
//        oneMoreInstructor[2] = new Person("John","Smith");
//        System.out.println(Arrays.toString(oneMoreInstructor));
//
//        for(Person instructor : oneMoreInstructor){
//            System.out.println(instructor.getFirstName());
//        }

//
////        instructors[2] = new Person("David","Stephens");
//
////        Person sophie = instructors[1];
////        sophie.getLastName();
//
////        System.out.println(instructors[2].getLastName());
//
//////        creating an Array of Car objects
//        Car[] myCars = {new Car(), new Car(), null, null};
//////        instantiate a new Object
//        myCars[2] = new Car();
//        myCars[2].setMake("Nissan");
//        myCars[2].setModel("Rogue");
//        myCars[2].setYear(2017);
//        System.out.println(myCars[2].getMake());
//        System.out.println(myCars[2].getModel());
//        System.out.println(myCars[2].getYear());
//
//        Car marksCar = myCars[0];
////        marksCar[0] = new Car();
//        marksCar.setMake("Ford");
//        System.out.println(marksCar.getMake());
//        System.out.println(myCars[1].getMake());
////
//        String[] theBeatles = {"John", "Ringo", "George", "Paul"};
//        Arrays.sort(theBeatles);
//        System.out.println(theBeatles);
//
//        for(String beatle: theBeatles){
//            System.out.println(beatle);
//        }
////
//////        Array manipulation methods
//////        Arrays.fill
//        String[] colors = new String[7];
//        Arrays.fill(colors, "blue");
//////        Arrays.toString
//        System.out.println(Arrays.toString(colors));
//        System.out.println(Arrays.toString(colorsCopy(colors, "red")));
//////        Arrays.equals
//        System.out.println(Arrays.equals(instructors,theBeatles));
//    }
////}
//
//
//
////    }
//
//    public static String[] colorsCopy(String[] array, String color) {
//        String[] newCopy = Arrays.copyOf(array, array.length + 1);
//
//        newCopy[newCopy.length - 1] = color;
//        return newCopy;
//    }
////there was an import of arrays for this method to work
//
//}
