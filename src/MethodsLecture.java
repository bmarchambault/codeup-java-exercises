public class MethodsLecture {
    //call all your methods here since this is the entry point.  it doesn't matter if this is at the top or the bottom.
    public static void main(String[] args) {
//       //        invokes version 1
//        orderFood();
////        invokes version 2
//        orderFood("Pizza");
////        invokes version 3
//        orderFood("Burgers", 3);
////        invokes version 4
//        orderFood("Sushi","Ramen");
//
//        favoriteSong("Vienna - Billy Joel");
//        weeksIn(12);
//        String myGreeting = "Good Day";
//        String cohort = "Olympic";
//
////        System.out.println(args);
//        greetCohort("Good Morning","Ganymede");
//        greetCohort("Hello", "Fortuna");
//        greetCohort(myGreeting,"Deimos");
//        greetCohort(myGreeting,cohort);
//        System.out.println(helloWorld());
    }
//public static long getPower(int base, int exponent) { 
// if (exponent == 0) { 
// return 1; 
// } else if (exponent == 1) { 
// return base; 
// } else if (exponent == 2) { 
// return base * base; 
// }         System.out.println("base: " + base); 
// System.out.println("exponent: " + exponent); 
// long count = base * getPower(base, exponent - 1); 
// System.out.println("current count: " + count); 
// return count;     } 
//
// ^ visual for me…helped me understand 


//}
//  METHODS

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */

    public static void orderFood() {
        System.out.println("I would like to order fries Please!");
    }

/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */


/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */
public static void favoriteSong(String song){
    System.out.println("My favorite song is: " + song);
}
/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */
    public static void weeksIn(int weeks){
        System.out.println("I've been at Codeup for " + weeks + "weeks.");
    }

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

    public static void orderFood(String food){
    System.out.printf("I would like a(n) %s please!\n", food);
    }

   //in order for this to be method overloading. the parameters need to be unique, not just the return type.


/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

    public static void orderFood(String food, int number){
        System.out.printf("I would like to %d %s\n", number, food);
    }

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */
public static void  orderFood(String item1, String item2){
    System.out.printf("I would like %s and %s \n", item1, item2);
}

//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }


   //you'll keep going until you finish your cycle.


// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number


    public static String helloWorld() {
//    System.out.println("Hello World");
        return "Hello World!";
    }

    //
    public static void greetCohorts(String greeting, String cohort) {
//return greeting + " " + cohort;
        System.out.println(greeting + " " + cohort);
    }
}//if the main is below, this is not needed.  but if main is on top, you need this here.

////call all your methods here since this is the entry point.  it doesn't matter if this is at the top or the bottom.
//public static void main(String[] args) {
//    orderFood();
//
//
//
//}
//        }

