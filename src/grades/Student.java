package grades;

import java.util.ArrayList;
import java.util.List;

public class Students {
//    private String studentFirstName;
//    private String studentLastName;
    private String studentName;
    private int grade;
    private List<Integer> grade;

//    public void Student (String studentFirstName, String studentLastName){
//        this.studentFirstName = studentFirstName;
//        this.studentLastName = studentLastName;
//    }


public void Student (String studentName){
    this.studentName = studentName;
     this.grade = new ArrayList<>();
}

//    public void addGrade(int grade){
//        grades.add(grade);
//    }
//
//    public double getGradeAverage(){
//        double sum = 0;
//        for(Integer grade : grades){
//            sum += grade;
//
//        }
//        return sum / grades.size();
//    }


    public static void main(String[] args) {



    }


}
