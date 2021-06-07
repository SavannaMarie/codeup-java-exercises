package grades;

/* It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:

       **returns the student's name
       public String getName();

       **adds the given grade to the grades property
       public void addGrade(int grade);

       **returns the average of the students grades
       public double getGradeAverage();*/

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {

    }


    public static void main(String[] args) {

        /*
        Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
         */

    }
}
