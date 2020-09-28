//package util;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.List;
//import static java.nio.file.Paths.get;
//
//public class FileHelper {
////    private static List<String> directoryFiles = new ArrayList<>();
////    private static boolean append;
////    private static Path textFile;
////    private static String filePath;
//
//    static Input in = new Input();
////Create a class named FileHelper inside of util, it should contain the static methods defined below, and should handle any exceptions (i.e. there should not be a throws in either method signature).
////
////For both methods, if an error is encountered, print out a message explaining what went wrong, then exit the program with the line of code: System.exit(1);
//
//
////    Create a method named slurp, it takes a string that is the filepath, and returns a list of strings (the file contents).
//    public static List <String> slurp(String filePath) {
//
//        try {
//            Path textFile = Paths.get(filePath);
//           return Files.readAllLines(textFile);
//        } catch (Exception e){
//            System.out.println("Invalid directory path ");
//            System.exit(1);
//        }
//        return null;
//    }
//
////    Create a method named spit, it should accept a filename, and a list of strings that are the contents of the file. It should also accept an optional third boolean argument that is whether or not to append to the file. This method should create the file if it doesn't already exist.
//
////    Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
//
//    public static void spit(String filename, List<String> fileContents, boolean willAppend){
//        try {
//        if (willAppend) {
//            Path p = Paths.get( filename);
//            Path Files.write(Path filepath, List < String > lines[, StandardOpenOption option])
//        }
//        }catch(Exception e){
//                System.out.println();
//                e.printStackTrace();
//            }
//
//            }
//
//    public static void main(String[] args) {
////        System.out.println(slurp("test/hello.txt" ));
//        System.out.println(slurp("test/test.txt" ));
//    }
//        }
//
////    Write some code that tests both of the methods above by calling them, and checking for the expected result. You might want to create some test files to test these methods as well.
////
////Create a method named makeExciting. It should accept a string that is a filepath, and uppercase every line, and add a "!" to the end of every line. Test this method by creating a test file and calling your method and passing the path of your test file.
////
////
////void makeExciting(String filename)
//
//
//
