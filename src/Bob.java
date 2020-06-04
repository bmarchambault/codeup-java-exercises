import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        /*
        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

--Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
--He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
--He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
--He answers 'Whatever.' to anything else.
Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
         */
//
//String qResponse = "Sure";
//String chillResponse = "Whoa, chill out!";
//String ignoredResponse = "Fine. Be that way!";
//String blanketResponse = "Whatever";
//String talkingToBob = "";
//String answer = "";

        Scanner userInput = new Scanner(System.in);

//      do {
//          System.out.println("Would you like to talk to Bob? (y/n)");
//          answer = userInput.next();
//          if(answer.equalsIgnoreCase("n")){
//              System.out.println("It's ok, he's not that interesting anyway");
//          }else{ System.out.println("Hey, What's up?");
//
//              talkingToBob = userInput.next();
//              if (talkingToBob.endsWith("?")) {
//                  System.out.println(qResponse);
//              } else if (talkingToBob.endsWith("!")) {
//                  System.out.println(chillResponse);
//              } else if (talkingToBob.length() == 0) {
//                  System.out.println(ignoredResponse);
//              } else {
//                  System.out.println(blanketResponse);
//              }
//
//          }
//          System.out.println();
//      }
//        while (answer.equalsIgnoreCase("y"));
//        {
//            System.out.println("Would you like to keep speaking with Bob? ");
//            answer = userInput.next();
//        }
//

        //SOPHIES WALKTHROUGH
        Scanner sc = new Scanner (System.in).useDelimiter("\n");
        System.out.println("if you want to talk to Bob, say hi!");

String userInput;
boolean greeting;
//BUILD THIS FIRST
//
//do{
//    userInput = sc.next();
//    greeting = (!userInput.equals("bye"));
//}while(greeting);
        do{
        userInput = sc.next();
    greeting = (!userInput.equals("bye"));
    if (userInput.endsWith("?")){
        System.out.println("Sure");
    }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out");
    }else if(userInput.equals("")){
                System.out.println("Fine. Be that way!");
            }else{
            System.out.println("Whatever!");
        }

}while(greeting);

//        ========================end, don't delete=========================
    }
}
