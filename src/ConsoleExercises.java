import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        trying again after car accident
//        ======================================
//Exercises:
//1. Copy this code into your main method:
double pi = 3.14159;
//Write some Java code that uses the variable pi to output the following:
//Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
  System.out.println(pi);


//2. Explore the Scanner Class.
    //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number");
int userInt = scanner.nextInt();
        System.out.println("Your number is " + userInt);
    //What happens if you input something that is not an integer?
    //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.println("Please enter three words.");
        String userWord1 = scanner.next();
        String userWord2 = scanner.next();
        String userWord3 = scanner.next();
        System.out.println("You typed " + userWord1 + " " + userWord2 + " " + userWord3);

    //What happens if you enter less than 3 words?
    //What happens if you enter more than 3 words?
    //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
    //do you capture all the words?

//3.  Rewrite the above example using the nextLine method.
        scanner.nextLine();
        System.out.println("Please enter a sentence.");
        String userSentence = scanner.nextLine();
        System.out.println("You typed: " + userSentence + ".");


//4. Calculate the perimeter and area of Codeup's classrooms.
    //Prompt the user to enter values of length and width of a classroom at Codeup.√
    //Use the nextLine method to get user input and parse the resulting string to a numeric type.√
        //Assume that the rooms are perfect rectangles.√
        //Assume that the user will enter valid numeric data for length and width.√
        //Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        System.out.println("Please enter a number for the length and a number for the width:");
        String length = scanner.next();
        String width = scanner.next();
        int lenghtInt = Integer.parseInt(length);
        int widthInt = Integer.parseInt(width);
        System.out.println("The area of the room is: " + (lenghtInt * widthInt));
        System.out.println("The perimeter of the room is: " + ((lenghtInt * 2) + (widthInt * 2)));

//
//Bonuses
//In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//scanner.useDelimiter("\n");
//How does this change the way your program operates?
//
//Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.



















//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately  %.2f", pi);


//Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter a number");
//        int userInput = scanner.nextInt();
//        System.out.println("Here's your number: " + userInput);

//        System.out.println("Please enter 3 words");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println(word1+ " " + word2+ " " + word3);
//            System.out.printf("%s%n%s%n%s%n",word1,word2,word3);
//        scanner.nextLine();//if this line isn't here, we couldn't get the user input for the following line.
//
//        System.out.println("Please enter a sentence");
//        String sentence = scanner.nextLine();
//
//        System.out.println("Here is your sentence: " + sentence);

//        System.out.println("Please enter a number representing length and a number representing width.");
//        String length = scanner.nextLine();
//        String width = scanner.nextLine();
//        int lengthInt = Integer.parseInt(length);
//        int widthInt = Integer.parseInt(width);
//        double lengthDbl = Double.parseDouble(length);
//        double widthDbl = Double.parseDouble(width);
//            System.out.println("The perimeter is" + (lengthInt *2) + (widthInt * 2));
//            System.out.println("the area is: " + (lengthInt * widthInt));
//            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %d %n. And the area is: %d",length, width, ((lengthInt *2)+(widthInt * 2)), (lengthInt * widthInt) );
//            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %.2f %n. And the area is: %.2f",length, width, ((lengthDbl *2)+(widthDbl * 2)), (lengthDbl * widthInt));

//=====================================================================================
            //bonus using the same code above:
//            The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//scanner.useDelimiter("\n");
//How does this change the way your program operates?
//            System.out.println("Please enter a number representing length and a number representing width.");
//            String length = scanner.useDelimiter("\n").nextLine();
//            String width = scanner.useDelimiter("\n").nextLine();
//            int lengthInt = Integer.parseInt(length);
//            int widthInt = Integer.parseInt(width);
//            double lengthDbl = Double.parseDouble(length);
//            double widthDbl = Double.parseDouble(width);
//            System.out.println("The perimeter is" + (lengthInt *2) + (widthInt * 2));
//            System.out.println("the area is: " + (lengthInt * widthInt));
//            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %d %n. And the area is: %d",length, width, ((lengthInt *2)+(widthInt * 2)), (lengthInt * widthInt) );
//            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %.2f %n. And the area is: %.2f",length, width, ((lengthDbl *2)+(widthDbl * 2)), (lengthDbl * widthInt));











    }
}
