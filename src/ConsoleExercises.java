import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately  %.2f", pi);


Scanner scanner = new Scanner(System.in);
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
            System.out.println("Please enter a number representing length and a number representing width.");
            String length = scanner.useDelimiter("\n").nextLine();
            String width = scanner.useDelimiter("\n").nextLine();
            int lengthInt = Integer.parseInt(length);
            int widthInt = Integer.parseInt(width);
            double lengthDbl = Double.parseDouble(length);
            double widthDbl = Double.parseDouble(width);
            System.out.println("The perimeter is" + (lengthInt *2) + (widthInt * 2));
            System.out.println("the area is: " + (lengthInt * widthInt));
            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %d %n. And the area is: %d",length, width, ((lengthInt *2)+(widthInt * 2)), (lengthInt * widthInt) );
            System.out.printf("The length is:  %s%n. The width is:  %s%n. The perimeter is:  %.2f %n. And the area is: %.2f",length, width, ((lengthDbl *2)+(widthDbl * 2)), (lengthDbl * widthInt));











    }
}
