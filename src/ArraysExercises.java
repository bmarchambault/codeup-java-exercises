import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//        returns reference type

//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.

       Person [] personArray = new Person[3];
        personArray[0] = new Person("Carl", "Rangle");
        personArray[1] = new Person("Monica", "Aldridge");
        personArray[2] = new Person("Hunter", "Davis");

        //Iterate through the array and print out the name of each person in the array.
//        for(Person people: personArray){
//            System.out.println(people.getFirstName() + " " +  people.getLastName() + ",");
//        }

        personArray = addPerson(personArray, new Person("Robert", "Engall"));//creates adds a person
//        Person[] personArray2 = addPerson(personArray, new Person("Cathy", "Martinez"));//saves value of adding a person into a new array to preserve the original
//        Person[] personArray3 = addPerson(personArray2, new Person("Justin", "Martinez"));//saves value of adding a person into the previous new array to preserve the previous array


        for(Person people: personArray){
            System.out.println(people.getFirstName() + " " +  people.getLastName() + ",");
        }


    }

    public static Person[] addPerson(Person[] personArray, Person extraPerson ){
        Person[] addPersonArray = Arrays.copyOf(personArray, personArray.length+1);
        addPersonArray[addPersonArray.length-1] = extraPerson;

        return addPersonArray;
    }

}