package Task3;

import java.util.ArrayList;

public class Student extends Personer {
private ArrayList<String> passedCourses;
private ArrayList<String> currentCourses;


    public Student(String name, ArrayList<String> currentCourses, ArrayList<String> passedCourses){
        super(name);
        this.currentCourses = currentCourses;
        this.passedCourses = passedCourses;

}
    public boolean addCourse(String course) {
        // Check if the course is in passedCourses
        if (passedCourses.contains(course)) {
            return false;  // Course already passed, cannot add
        }
        // Add the course to currentCourses
        currentCourses.add(course);
        return true;  // Course added successfully
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ", Current Courses: " + currentCourses +
                ", Passed Courses: " + passedCourses;  // Optional: include passed courses
    }
}




