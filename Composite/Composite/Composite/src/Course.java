
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lruesch
 */
public class Course {
    private String department;
    private String number;
    private String title;
    private String description;
    private ArrayList<Course> courses = new ArrayList<>();
    
    
    public Course(String department, String number, String title, String description)
    {
        this.department = department;
        this.number = number;
        this.title = title;
        this.description = description;
    }
    
    public String toString()
    {
        return department + number + ": " + title;
    }

    public void addPrerequisite(Course course) {
        courses.add(course);
    }

    public String getPrerequisites() {
        String baseCourse = this.toString() + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(baseCourse);

        for (Course course: courses)
        {
            sb.append(course.getPrerequisites()).append("\n");
        }

        return sb.toString();

    }
}
