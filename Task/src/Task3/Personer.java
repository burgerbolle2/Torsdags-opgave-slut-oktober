package Task3;
import java.util.ArrayList;

public class Personer {
    private String name;


    public Personer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

    public boolean addCourse(String course) {
        return true;
    }



    }
