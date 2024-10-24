package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personer personer = new Personer("Name");
        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Mathematics");
        canTeach.add("Physics");

        ArrayList<String> currentCourses = new ArrayList<>();
        currentCourses.add("Datamatik");
        currentCourses.add("Matematik");

        Teacher teacher = new Teacher("Tess", "Datamatik", canTeach, currentCourses);

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Computer Science");

        Student student = new Student("Kreiner", currentCourses, passedCourses);

        boolean added = student.addCourse("Mathematics");
        System.out.println("Added Mathematics: " + added);


        added = student.addCourse("Mathematics");
        System.out.println("Added Mathematics again: " + added);


       
        added = student.addCourse("Physics");
        System.out.println("Added Physics: " + added);


        System.out.println(student);

        System.out.println(personer.getName());
        System.out.println(teacher);
        System.out.println(student);

        System.out.println(personer.getName());

        teacher.setSubject("Softwareudvikling");
        System.out.println("Updated: " + teacher);
    }
}
