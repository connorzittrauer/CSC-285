/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Composite
 *  File Name: Course.java
 */

/*  This class provides an implementation for a course.
 *  Its use is as the 'component' of the design pattern.
 */

import java.util.ArrayList;

/**
 * @author lruesch
 */
public class Course
{
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

    public void addPrerequisite(Course course)
    {
        courses.add(course);
    }

    /* This method adds the base course to the StringBuilder string,
     * iterates through the course ArrayList and recursively finds any
     * sub-courses of those courses within in the foreach loop.
     *
     * The base case is when the courses ArrayList is empty.
     */
    public String getPrerequisites()
    {
        String baseCourse = this + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(baseCourse);

        for (Course course : courses)
        {
            sb.append(course.getPrerequisites());
        }
        return sb.toString();
    }
}
