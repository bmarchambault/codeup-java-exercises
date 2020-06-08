import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
 //

//        System.out.println(addition(3, 4));
//        System.out.println(subtract(5, 9));
//        System.out.println(multiplication(9, 5));
//        System.out.println(division(45, 9));
//        System.out.println(remainderOf(13, 2));
//        getInteger(1, 10);
        calFactorial(1, 10);
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

// bonus 1: Create your multiplication method without the * operator (Hint: a loop might be helpful).
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


    public static void getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput >= 1 && userInput <= 10) {
            System.out.println(userInput);
            System.out.println("great job");

        } else{
            System.out.println("That is not a valid number, please enter a number between 1 and ten");
           getInteger(min, max);
        }

    }

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

    public static long calFactorial(int min, int max) {
        Scanner sc = new Scanner(System.in);
        String answer;
        long result = 1;
        System.out.println("enter an number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput >= 1 && userInput <= 10) {//else complete
        System.out.println("enter y to see the factors of your number. enter n to exit");
         answer = sc.next();
            if (answer.equalsIgnoreCase("y")){
                for(int i = 1; i<=userInput; i++){
                    result = result *i;
                }

            } else{
                System.out.println("ok, another time");

            }


        } else{
            System.out.println("That is not a valid number, please enter a number between 1 and ten");
            calFactorial(min, max);
        }
        System.out.println(result);
    return result;

    }






    }

