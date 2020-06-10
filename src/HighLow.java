//import java.util.Scanner;
//
//public class HighLow {
//    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
//    public static void main(String[] args) {
//guessingGame();
//    }

//Game Development 101
//
//Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src. DONE
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

//    if userinput >random number - higher
//    if userinput < random number - lower
//    if userinput = random number - Good Guess
//    if userguess = limit; Sorry, you lose.
    // give rules:  you only get x amount of guesses.  if you guess it before you run out of guesses, you win.

//    public static void guessingGame() {
//        String response = "";
//        String userGuess;
//        int numOfUserGuesses = 0;
//        int guessLimit = 10;
//        int randomNum;
//        System.out.println("Would you like to play a guessing game? (y/n)");
//        response = sc.next();
//        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
//            System.out.println("You get 10 guesses.  I'll tell you higher or lower to help you.  If you guess before you run out of turns, you win.  Still want to play? (y/n)");
//            response = sc.next();
//            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
//                do{
//                randomNum = (int) (Math.random() * 100) + 1;
//                    System.out.println("Enter your guess:");
//                    userGuess = sc.next();
//                double userGuessdbl = Double.parseDouble(userGuess);
//                numOfUserGuesses += 1;
//
////                for ( int numOfUserGuesses = 0; numOfUserGuesses < guessLimit; numOfUserGuesses ++) {
//            }while (numOfUserGuesses < guessLimit){
//                    if (userGuessdbl < randomNum) {
//                        System.out.println("Higher");
//                    } else if (userGuessdbl > randomNum) {
//                        System.out.println("Lower");
//                    } else if (userGuessdbl == randomNum) {
//                        System.out.println("GOOD GUESS");
//                    }else if(numOfUserGuesses == guessLimit ) {
//                        System.out.println("Sorry, no more guesses.  You loose.");
//                }
//                }
//            }else {
//                System.out.println("Maybe another time then.");
//            }
//        } else {
//            System.out.println("Maybe another time then.");
//        }
//
//    }
//
//
//
//
//
//
//
//}
