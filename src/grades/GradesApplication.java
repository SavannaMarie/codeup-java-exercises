package grades;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student marky = new Student("Marky");
        Student mark = new Student("Mark");
        Student killer = new Student("Killer");
        Student mom = new Student("Mom");

        marky.addGrade(99);
        marky.addGrade(90);
        marky.addGrade(85);

        mark.addGrade(75);
        mark.addGrade(56);
        mark.addGrade(89);

        killer.addGrade(50);
        killer.addGrade(87);
        killer.addGrade(69);

        mom.addGrade(84);
        mom.addGrade(87);
        mom.addGrade(91);

        students.put("pawPatrolLvr", marky);
        students.put("IPlayGuitars", mark);
        students.put("BigFatCatMeow", killer);
        students.put("MarkysMom19", mom);

        System.out.println(students.keySet());


        boolean confirm = true;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");


        do {
            System.out.println("Please select a username to view a student's information: ");
            String selection = scanner.nextLine();
            System.out.println(selection);
            if (!students.containsKey(selection)) {
                System.out.println("Invalid username. Please try again");
            }
            if (students.containsKey(selection)) {
                Student searchResult = students.get(selection);
                System.out.println("Student's Name: " + searchResult.getName() + " \nGithub Username: " + selection + " \nAverage Grade: " + df.format(searchResult.getGradeAverage()) + "\n");

                System.out.println("Would you like to select another student? y/n");
                String answer = scanner.nextLine().toLowerCase();
                if (!answer.equals("y")) {
                    confirm = false;
                }
            }
        }
        while (confirm);
    }
}