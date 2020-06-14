package movies;
import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {

    Input in = new Input();
    Movie [] movieList = findAll();

    boolean keepChoosing = true;
    do {
        System.out.println("what would you like to do? \n \n 0 - exit \n 1 - view all movies \n 2 - veiw all movies in the animated category \n 3 - view all movies in the drama category \n 4 - view all movies in the horror category \n 5 - view all movies in the sci-fi category \n \n Please enter your choice: ");
        int userInput = in.getInt(0,5);//6 to add a new movie
     //   this is to prevent Scanner from holding onto the new line character once we press enter
        in.getString();


        switch (userInput){
            case 0:
                System.out.println("Thanks for using Movie App!");
                keepChoosing = false;
                break;
            case 1:
                for (Movie movie : movieList){
                    System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                }
                break;
            case 2:
                for (Movie movie : movieList){
                    if(movie.getMovieCategory().equals("animated")){
                        System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                    }
                }
                break;
            case 3:
                for (Movie movie : movieList){
                    if(movie.getMovieCategory().equals("drama")){
                        System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                    }
                }
                break;
            case 4:
                for (Movie movie : movieList){
                    if(movie.getMovieCategory().equals("horror")){
                        System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                    }
                }
                break;
            case 5:
                for (Movie movie : movieList){
                    if(movie.getMovieCategory().equals("scifi")){
                        System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                    }
                }
                break;
//            case 6:
//                System.out.println("Prepare to add a new movie.");
////                    take user input for new movie name
//                System.out.println("What is the movie name?");
//                String newName = in.getString();
////                    input.getString();
////                    take user input for new category
//                System.out.println("What is the movie category?");
//                String newCat = in.getString();
////                    create a new Movie object to add to our list
//                Movie newMovie = new Movie(newName,newCat);
//                System.out.println("Your new movie is being added to the " +
//                        "list. Please wait...");

//                ArrayList<Movie> myMovies =
//                        new ArrayList<>(Arrays.asList(movieList));
//                myMovies.add(newMovie);
//                movieList = myMovies.toArray(movieList);
//                for (Movie movie : movieList){
//                    System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
            default:
                System.out.println("Please enter one of the options.");
                }

        }while (keepChoosing );
    }



}
