package arraysLecture;



public class ArraysLecture {

    public static void main(String[] args) {

//        String[] planets = new String[8];
        //or initialize:
        int numberOfPlanets = 8;
        String[] planets = new String[numberOfPlanets];

        System.out.println(planets.length);//prints a number
        System.out.println(planets[0]);//zero based index.  right now, its going to say null because our array is empty.  need to assign values.
        planets[0]= "Mercury";
        planets[7]= "Neptune";
//        you can just :  planets[8] = "Pluto" and expect a new index to be created because we defined the array to have 7 indexes.  we'll get a compile error saying out of bounds.
//
//===============================================================================
// if we know the values of the objects we can use an array initializer (array literal)
        int[] myNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//==================================================================================
//        to create an array, we need to know the type and the object
        Person justin = new Person("Justin", "Reich");
Person[] instructors = new Person[3];




    }





}
