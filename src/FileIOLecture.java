import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) throws IOException {
        Path myDirectory = Paths.get("src");
        Path gitignore = Paths.get(".gitignore");

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.notExists(gitignore));

//        ==========creating a directory: =======
        String directory = "test";
        Path myTest = Paths.get(directory);
//        if (Files.notExists(myTest)){
//            Files.createDirectory(myTest);//without "throws" keyword in the class or a try catch, you'll get an error here.  use a try catch because we can use code to fix this.
//
        if (Files.notExists(myTest)){
           try{
               Files.createDirectory(myTest);
           }catch (IOException e){
               e.printStackTrace();
           }
        }

//        =============creating a file:=======================
        Path helloFile = Paths.get(directory, "hello.txt");

        if (Files.notExists(helloFile)) {
            try {
                Files.createFile(helloFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//===========to add text to a file - in this case hello.txt=================
//        lets make a list first:
        List<String> instructors = Arrays.asList("Justin", "Sophie", "Vivian");
//        or:
//        String [] names = {"Justin", "Sophie", "Vivian"}; //an array literal - can't .add to this.
//         List<String> instructors = Arrays.asList(names);//arrays.asList will turn the array to an array list.
//        Files.write(helloFile, instructors);//need to try catch
        try {
            Files.write(helloFile, instructors);
        }catch(IOException e){
            e.printStackTrace();
        }
        //if we did - you'll overwrite the instructors array with an empty array:
        List <String> students = new ArrayList<>();
         try {
                    Files.write(helloFile, students);
                }catch(IOException e){
                    e.printStackTrace();
                }
//        you can add to the empty array with your array methods:
        students.add("Laura"); //etc...
        students.add("Jay");
        students.add("Aaron");
        students.add("Chris");
        students.add("Mark");
//      ============reading from a file=using an enhanced for loop: ===================
        try {
            List<String> myStudents = Files.readAllLines(helloFile);//you would create a new variable (myStudents) if you didn't know what the array was called or what was in it.
            System.out.println(myStudents);
        } catch (IOException e){
            e.printStackTrace();
        }//returns an array

        List <String> myStudents = Files.readAllLines(helloFile);
        for(String student : myStudents){
            System.out.println(student);
        }

//        =================appending to a file===============
        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon", "Julia", "Augustine");
    Files.write(helloFile, newStudents, StandardOpenOption.APPEND);

    }
}
//Java File I/O
//
//### What is File I/O?
//- Allows us to read and write data to memory.
//- To use File I/O we need to import the java.io and java.nio packages.
//
//### Java IO vs Java NIO
//- Java IO behaves synchronously:
//  - Data streams byte by byte.
//  - Thread calls are blocked until the current read() or write() operation is complete.
//  - Simpler to use for small scale applications
//
//- Java NIO behaves asynchronously:
//  - Data is cached in a buffer (large blocks of data). Allows for multi-threading
//  - Faster performance in large scale applications
//
//** We'll be using a combination of these two packages today. **
//
//### What's a Path? A File?
//- Path: refers to the location of a file in the system
//  - Absolute Path: Like the address to a house. Always the same.
//  - Relative Path: Asking for directions to a house. Depends on where you currently are.
//- File: contains the data on a storage device (ie. index.html, style.css, dog.jpg, etc.)
//  - The house itself.
//
//### Paths
//- In Java File I/O, file paths are represented as Objects.
//- The imported packages give us methods to turn a path into an Object.
//- This abstracts away the differences between file system paths (MacOS vs Windows)
//  - Remember that Java can run anywhere!
//
//  1. Write the absolute path to your IdeaProjects folder.
//  2. If you cd into my IdeaProjects folder, what is the relative path to codeup-web-exercises?
//  3. Using Paths.get(), check to see if your .gitignore file exists. Print the result
//
//### Files
//- Files in Java I/O are also represented as Objects.
//
//1. Check for the file 'info.txt' inside of the 'data' directory. What happens?
//2. Try it yourself.
//  - create a new directory called 'test' in the root of your project. Make sure this is only created if it doesn't already exist.
//  - inside of the 'test' directory, use the Files class to create 'hello.txt'
//
//### Reading and Writing Files
//
//[Reading Files Line by Line in Java](https://stackabuse.com/reading-a-file-line-by-line-in-java/)