import java.util.Arrays;

public class ServerNameGenerator {

//    String adjectives[] = new String[10];
//    String nouns[] = new String [10];

    private static String [] adjectives = {
                                            "happy",
                                            "spotted",
                                            "wet",
                                            "angry",
                                            "sharp",
                                            "shiny",
                                            "weak",
                                            "strong",
                                            "simple",
                                            "loud",
                                            };



    private static String [] nouns = {
                                        "squirrel",
                                        "family",
                                        "rock",
                                        "pocket",
                                        "superhero",
                                        "cake",
                                        "car",
                                        "teacher",
                                        "hammer",
                                        "rabbit",
                                   };

    //loop though
    //select random 1-10
    //return element
//    for(a)

        public static String randomWord (String[] chosenArray){
            int randomIndex = (int)(Math.random() * chosenArray.length);
            String randWord = "";
            for(int i = 0; i < chosenArray.length; i++){//equal doesnt work because though there are 10 spots, theres not an element in index 10 because there is no index 10
                if (chosenArray[i] == chosenArray[randomIndex])
                randWord += chosenArray[i];

                }
            return randWord;
//}
        }

//    public static String randomAdj (String[] adjectives){
//        int randomIndex = (int)(Math.random() * adjectives.length);
//        String randAdj = "";
//        for(int i = 0; i < adjectives.length; i++){
//            if (adjectives[i] == adjectives[randomIndex])
//                randAdj += adjectives[i];
//
//        }
//        return randAdj;
//}
//    }

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(randomNoun(nouns)));

        System.out.println("Here is your server name: " + randomWord(adjectives) + "-" + randomWord(nouns));


    }



}

//Server Name Generator
//
//We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//Example Output
//
//
//Here is your server name:
//dedicated-photon