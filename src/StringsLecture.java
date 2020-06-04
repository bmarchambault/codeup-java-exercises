import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
//            NOTES FROM SOPHIE:
   /*
   STRINGS ARE IMMUTABLE
    - DON'T OVERWRITE STRINGS IN JAVA - SO ONCE CREATED, IT CANT BE CHANGED.
       - INSTEAD, WE UPDAT THE OBJECT THAT THE VARIABLE IS REFERENCING
            - WHITEBOARD VS BOX
    STRING MEDDAGE = "HELLO";
    SOUT(MESSAGE)://PRINTS "HELLO"
    MESSAGE = MESSAGE + " WORLD!";
    SOUT(MESSAGE); //PRINTS "HELLO, WORLD!"
            --You might be tempted to say that the example above disproves string immutability, as we clearly changed the value of the message variable. You would, however, be wrong. While we are changing what is stored in the message variable, we are changing the reference. Meaning that when we do the string concatenation (message + " World"), we aren't modifying the original string; rather, we are creating a new String object, and updating message to reference the new String object, instead of the old one.

    .STARTWITH
    .ENDSWITH
        - THESE ARE CASE SENSITIVE.

     STRING MANIPULATION METHODS:  USE EXAMPLES BELOW:

    */

//        Uncomment the Scanner and String variables.

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");
//
        String input = sc.nextLine();
//
        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */



        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"
//LOOKING FOR AN EXACT MATCH, USE .EQUALS:
//        if (input.equals(name)){
//            System.out.println("Welcome Jane Doe!");
//        }
        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."
//        if(input.equalsIgnoreCase(name)){
//            System.out.println("Names are proper nouns...");
//        }

        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"
//FIRST MANIPULATION METHOD = STARTSWITH.
//        if(input.startsWith(name)){
//            System.out.println("Hi Jane!");
//        }

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."

        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */


//        System.out.println(name.charAt(3));
//                  zero index should show e in jane
//        System.out.println(name.indexOf("Doe"));
//                  returns the first occurrence of a certain substring.  returns -1 of the substring is not found .. should return 5
//        System.out.println(name.lastIndexOf("e"));
//                  starts the search at the end of the string.  returns the first occurrence from the end.  // should return 7, the e in Doe.   has two paramenters:  string and substring
//        System.out.println(name.length());
//                  the number of indexes in a string. //should return 8 to include the space.  it is not zero indexed.
//        System.out.println(name.replace("Doe", "Smith"));
//                 -- takes in a target and a replacement - like find and replace. case sensitive.  could do a name.toLowerCase().replace()
//        System.out.println(name.substring(3));//returns e Doe//doesn't modify originial string
//                  -- syntax:  String substring(int beginIndex[, int endIndex])
        //String nameSubString = name.substring(3)//stores the new name in a variable
        // --          -- useing two parameters:
        ///String nameSubString = name.substring(3).toUpperCase(); cant tack on indexof() because its being stored into a string variable and indexof returns an int.

//        System.out.println(name.substring(0,3));//return Jan
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        // trim is really useful for catching user errors on input.
//        String trimThis = "    too many spaces   ";

//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());//preserves the original string so we need to save the modified version into a variable
//        String trimmedVersion = trimThis.trim();
//        System.out.println(trimmedVersion);

        // How would we fix this?
//        System.out.println("Here is a backslash \\");

    }
}
