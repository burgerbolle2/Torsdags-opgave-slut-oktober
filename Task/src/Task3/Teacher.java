package Task3;

import java.util.ArrayList;

class Teacher extends Personer {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;


    private String subject;

    public Teacher(String name, String subject, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.subject = subject;
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Teacher: " + getName() + ", Subject: " + subject +
                ", Current Courses: " + currentCourses;
    }
}
