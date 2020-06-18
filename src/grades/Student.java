package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    protected List<Integer> grade;


    public Student(String studentName) {
        this.studentName = studentName;
        this.grade = new ArrayList<>();
    }


    public void addGrade(int grade) {
        this.grade.add(grade);
    }
 public String getStudentName (){
        return this.studentName;
 }

    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grade) {
            sum += grade;
        }
        return sum / grade.size();
    }

//public void getGrade(){
//    System.out.println(grade);;
//}
//    public static void main(String[] args) {
//     Student s1 = new Student("Student1");
//     s1.addGrade(78);
//     s1.addGrade(84);
//     s1.addGrade(90);
//        System.out.println("Student name: " + s1.getStudentName() + "\n \t Students grades: " + s1.grade + "\n \t Students grade average: " + s1.getGradeAverage());
//
//
//    }

}







