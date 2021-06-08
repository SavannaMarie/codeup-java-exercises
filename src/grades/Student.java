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
    public String getName() {
        return this.name;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public double getGradeAverage() {
        double total = 0.0;
        for (Integer grade : this.grades) {
            total = total + grade;
        }
        double gradesAdded = total / this.grades.size();
        return gradesAdded;
    }



    public static void main(String[] args) {
        /*
        Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
         */

        Student savanna = new Student("Savanna");
        System.out.println("Grades for " + savanna.getName() + ": ");
        savanna.addGrade(100);
        savanna.addGrade(90);
        savanna.addGrade(88);
        savanna.addGrade(40);
        System.out.println(savanna.getGrades());
        System.out.println("=================");

        System.out.print("Grade average for " + savanna.getName() + ": ");
        System.out.print(savanna.getGradeAverage());


        if (savanna.getGradeAverage() > 50 && savanna.getGradeAverage() < 80){
            System.out.println("\nYou're making a C! I believe in you!");
        } if (savanna.getGradeAverage() >= 80 && savanna.getGradeAverage() < 90){
            System.out.println("\nAmazing!! You're making a B!! Impressive!");
        } if (savanna.getGradeAverage() >= 90 && savanna.getGradeAverage() < 99){
            System.out.println("You're making an A!! Excellent!");
        }

    }
}
