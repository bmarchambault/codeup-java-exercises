package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
//
        Student s1 = new Student("Student1");
        s1.addGrade(78);
        s1.addGrade(84);
        s1.addGrade(90);
//
        Student s2 = new Student("Student2");
        s2.addGrade(78);
        s2.addGrade(84);
        s2.addGrade(90);

        Student s3 = new Student ("Student3");
        s3.addGrade(78);
        s3.addGrade(84);
        s3.addGrade(90);

        //creating a hashmap
        HashMap<String, Student> student = new HashMap<>();
        student.put("stu1", s1);
        student.put("stu2",s2 );
        student.put("stu3",s3 );


        Input in = new Input();
        boolean continueSearch;
        do {
            System.out.println("Here is your list of Github usernames for all students");
            for (String userName : student.keySet()){
                System.out.println(" | " + userName + " |") ;
            }
            String userSearch = in.getString("Enter the github user name of the student you would like to view");
            if (student.containsKey(userSearch)) {
                System.out.println("Student name: " + student.get(userSearch).getStudentName() +
                        " - Github user name: " +  userSearch +
                        "\n \t Students grades : " + student.get(userSearch).grade +
                        "\n \t Student grade point average: " +
                        student.get(userSearch).getGradeAverage());

            } else {
                System.out.println("No user exits by that user name");
            }
                continueSearch = in.yesNo("Would you like to search again? ");

        } while (continueSearch) ;

    }
}

//Bonus
//
//Display all of the student's grades in addition to the grade average.
//
//Allow the user to view all of the grades for all of the students.
//
//Modify your CLI to provide an option to view the overall class average.
//
//Modify your CLI to provide an option to print a csv report of all the students.
//
//Example Output
//
//
//name,github_username,average
//Zach,zgulde,81.2
//Ryan,ryanorsinger,88.3
//Fernando,fmendozaro,90.4
//...
//Add an attendance property to your Student objects. It should be a HashMap. The keys should be strings representing the date, in the format "2017-10-02", and the values should be Strings that are one of:
//
//"A": Absent
//"P": Present
//
//Add a method named recordAttendance(String date, String value) that adds records to the HashMap this method should make sure value is an an acceptable string.
//
//Create an instance method on your Student class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
//Add the attendance information to the output of your command line interface, this should require only a small change.
//Create an instance method on Student that finds the specific days a student was absent. This method should return a List of Strings, where each string is the date of the absence.