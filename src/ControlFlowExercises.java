import java.util.Scanner;

public class ControlFlowExercises {
	public static void main(String[] args) {

//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

// int i = 5;

//while (i <= 15){
//    System.out.print(i + " ");
//    i++;
//        }

//===================================
//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        //try writing the while first so you know when your stopping point is

//int i = 0;
//
//do  {
//    System.out.println(j);
//    i += 2;
//} while (i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//int i = 100;
//
//do  {
//    System.out.println(i);
//    i-=5;
//} while (i >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//this didn't work with int because it wasn't the right range. even though 65536 is less than a mil, the operation of squaring it still happens.  You'll get zeros with int due to this because int isn't big enough to hold the last operation.  it ensure that the data type stays a long use:  long i = 2L;
//long i = 2;
//
//do  {
//    System.out.println(i);
//    i*=i;
//} while (i <= 100000);
//=================================================================
//        For
//
//        Refactor the previous two exercises to use a for loop instead.

//for (int i = 5;  i <= 15; i++){
//    System.out.println(i);
//}

//for(int i = 0; i <= 100; i += 2){
//    System.out.println(i);
//}
//
//for (int i = 100; i >= -10; i -=5){
//    System.out.println(i);
//}

//for (long i = 2; i <= 1000000; i *= i){
//    System.out.println(i);
//}
//

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100. CHECK
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//for (int i = 1; i<= 100; i++){
//    if (i % 3 == 0 && 1 % 5 == 0){//or if( i % 15 === 0)
//        System.out.println("Fizz Buzz");
//    } else if (i % 5 == 0){
//        System.out.println("Buzz");
//    } else if ( i % 3 == 0) {
//        System.out.println("Fizz");
//    } else {
//        System.out.println(i);
//    }
//}
//======================================================
//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//                2      | 4       | 8
//               3      | 9       | 27
//                4      | 16      | 64
//               5      | 25      | 125
//		Scanner sc = new Scanner(System.in);
//        String answer1 = "";
//        System.out.println("would you like to make a math table? : (Y/N)");
//        answer1 = sc.next();
//        if (answer1.equalsIgnoreCase("y") ) {
//            System.out.println("What number would you like to go up to? ");
//            int userInput = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                if (i * i <= 10) {
//                    System.out.print(i);
//                    System.out.print("      | " + (i * i));
//                    System.out.print("       | " + (i * i * i));
//                    System.out.println();
        //   //alternatively:  sout (i + "       | " + (i * i) + "        | " + (i * i * i));
        //  // another alt  souf("%d        | %d           | %d%n", i, i*i, i*i*i);
//                } else {
//                    System.out.print(i);
//                    System.out.print("      | " + (i * i));
//                    System.out.print("      | " + (i * i * i));
//                    System.out.println();
//                }
//            }
//        }else{
//            System.out.println("ok, maybe next time.");
//        }

//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//String answer = "";
//      System.out.println("Would you like to see your letter grade?  (Y/N)");
//        answer = sc.next();
//        if (answer.equalsIgnoreCase("y") ){
//		System.out.println("Enter your grade 0-100");
//		int userGradeInput = sc.nextInt();
//        String msg = "Your letter grade is: ";
//        if (userGradeInput >= 88) {
//            System.out.println(msg + "A");
//        } else if (userGradeInput <= 87 && userGradeInput >= 80) {
//            System.out.println(msg + "B");
//        } else if (userGradeInput <= 79 && userGradeInput >= 67) {
//            System.out.println(msg + "C");
//        } else if (userGradeInput <= 66 && userGradeInput >= 60) {
//            System.out.println(msg + "D");
//        } else {
//            System.out.println(msg + "F");
//        }
//
//    }else{
//            System.out.println("No problem, have a great day");
//        }

//		if (answer.equalsIgnoreCase("y") ) {
//			int[] arrayForA = {99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88};
//            int[] arrayForB = {87, 86, 85, 84, 83, 82, 81, 80};
//            int[] arrayForC = {79, 78, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67};
//            int[] arrayForD = {66, 65, 64, 63, 62, 61, 60};
//			String msg = "Your letter grade is: ";
//			int i = 0;
//			boolean foundIt = false;
//			for (i = 0; i < arrayForA.length; i++) {
//                if (arrayForA[i] == userInput) {
//                    System.out.println(msg + " A ");
//                }
//            }
//                for (i = 0; i < arrayForB.length; i++) {
//                    if (arrayForB[i] == userInput) {
//                        System.out.println(msg + "B");
//                    }
//                }
//                        for (i = 0; i < arrayForC.length; i++) {
//                            if (arrayForC[i] == userInput) {
//                                System.out.println(msg + "C");
//                            }
//                        }
//                            for (i = 0; i < arrayForD.length; i++) {
//                                if (arrayForD[i] == userInput) {
//                                    System.out.println(msg + "D");
//
//                } else{
//                    System.out.println(msg + "F");
//                }
//                }
//          }

//Sophies walkthrough:
        Scanner userInput = new Scanner(System.in);
        String answer = "";

//        System.out.println("Would you like to see your letter grade? (y/n)");
//        answer = userInput.next();
//while(answer.equalsIgnoreCase("y")){
//    System.out.println("Please enter the numeric grade:");
//    int grade = userInput.nextInt();
//    char letterGrade;
//    if(grade >= 88){
//        letterGrade = 'A';
//    }else if(grade >= 80){
//        letterGrade = 'B';
//    }else if(grade >= 67){
//        letterGrade = 'C';
//    }else if (grade >= 60){
//        letterGrade = 'D';
//    } else {
//        letterGrade = 'F';
//    }
//    System.out.printf("Your letter grade is:  %c.%n", letterGrade);
//    System.out.println("Do you want to check more grades?");
//    answer = userInput.next();
//}
//
//
//


//=========end==don't delete======================
    }

}
