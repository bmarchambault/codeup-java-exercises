import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
//        System.out.println(addition(3, 4));
//        System.out.println(subtract(5, 9));
//        System.out.println(multiplication(9, 5));
//        System.out.println(division(45, 9));
//        System.out.println(remainderOf(13, 2));
//        getInteger(1, 10);
//        calFactorial(1, 10);
//        rollDice(1, 10);

    }
    //1
//      public static int addition(int n1, int n2){//use double for all these for more complex numbers.
//          return  n1 +  n2;
//        }
//
//    public static int subtract (int n1, int n2){
//        return  n1 -  n2;
//    }
//
//    public static int multiplication (int n1, int n2){
//        return  n1 *  n2;
//    }
//
//    public static int division(int n1, int n2){
//        return  n1 /  n2;
//    }
//    public static int remainderOf(int n1, int n2){
//        return  n1 %  n2;
//    }

            // bonus 1: Create your multiplication method without the * operator
             // (Hint: a loop might be helpful).
            //Do the above with recursion.

            //    public static int addition(int n1, int n2){
            //          return  n1 +  n2;
            //        }

            //2  Create a method that validates that user input is in a certain range
                //The method signature should look like this:
                //          public static int getInteger(int min, int max);
            //    and is used like this:
            //            System.out.print("Enter a number between 1 and 10: ");
                //          int userInput = getInteger(1, 10);


//    public static int getInteger(int min, int max) {
//        System.out.println("enter an number between 1 and 10: ");
//        int userInput = sc.nextInt();
//        if (userInput > min && userInput < max) {
////            System.out.println(userInput);
//            System.out.println("Thank You. ");
//            return userInput;
//
//        } else{
//            System.out.println("That is not a valid number, please enter a number between 1 and ten");
//           return getInteger(min, max);
//        }
//    }

                //    3:  Calculate the factorial of a number.
                //
                //Prompt the user to enter an integer from 1 to 10.  DONE
                //Ask if the user wants to continue.  DONE
                //Continue only if the user agrees to. DONE
                //Assume that the user will enter an integer, but verify it’s between 1 and 10. DONE
                //Display the factorial of the number entered by the user.
                //Use a for loop to calculate the factorial.
                //Use the long type to store the factorial.
                //A factorial is a number multiplied by each of the numbers before it.
                //Factorials are denoted by the exclamation point (n!). Ex:
                //
                //
                //1! = 1               = 1
                //2! = 1 x 2           = 2
                //3! = 1 x 2 x 3       = 6
                //4! = 1 x 2 x 3 x 4   = 24

//    public static long calFactorial(int min, int max) {
//        String answer;
//        long result = 1;
//        int userInteger = getInteger(min, max);
//        System.out.println("Would you like to see the factorial for your number? (y/n)");
//         answer = sc.next();
//            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
//                for(int i = 1; i<=userInteger; i++){
//                    result = result *i;
//                }
//            } else{
//                System.out.println("ok, another time");
//            }
//        System.out.println(result);
//        return result;
//
//    }

            // 4:  Create an application that simulates dice rolling.
            //
            //Ask the user to enter the number of sides for a pair of dice.

            //    get integer; and prompt

            //Prompt the user to roll the dice.

                // a wish  to continue.

            //"Roll" two n-sided dice, display the results of each,
            // and then ask the user if    he/she wants to roll the dice again.

                //displaying two numbers between 1 and the number of sides of the dice.

            //Use static methods to implement the method(s) that generate the random numbers.
            //Use the .random method of the java.lang.Math class to generate random numbers.

//public static int rollDice( int min, int max) {
//    String response = "";
//    int dieOne = 0;
//    int dieTwo = 0;
//
//    System.out.println("Would you like to roll the die? (y/n)");
//    response = sc.next();
//    if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
//    int diceSides = getInteger(min, max);
//        dieOne += (int)(Math.random() * diceSides) + 1;
//
//        dieTwo += (int)(Math.random() * diceSides) + 1;
//
//    }
//    System.out.println(dieOne);
//    System.out.println(dieTwo);
//    return dieOne & dieOne;
//}

//5  Game Development 101
//
//Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//The specs for the game are:
//
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.
//Bonus
//
//Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.








    }

