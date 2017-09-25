package lab4;

/**
 * Faculty.java
 */

public class Faculty extends Employee {

    private String[] courses;

    /**
     * default constructor
     */
    public Faculty() {
        super();    //gets called automatically
        courses = new String[4];
    }

    /**
     * constructor with employee name, salary, and list of courses
     * @param inName - name of faculty member
     * @param inSalary - salary of faculty member
     * @param inCourses - courses of faculty member
     */
    public Faculty(String inName, double inSalary, String[] inCourses) {
        super();
        setName(inName);
        setSalary(inSalary);
        setCourses(inCourses);
    }

    /**
     * get the name of the faculty member
     * @return name of faculty member
     */
    public String getName() {
        return "Professor " + super.getName();
    }

    /**
     * get a copy of the courses of the faculty member
     * @return courses of faculty member
     */
    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for(int i = 0; i < courses.length; i++) {
            temp[i] = courses[i];
        }
        return temp;
    }

    /**
     * set the courses for the faculty member
     * @param inCourses - the new courses for the faculty member
     */
    public void setCourses(String[] inCourses) {
        courses = new String[inCourses.length];
        for(int i = 0; i < inCourses.length; i++) {
            courses[i] = inCourses[i];
        }
    }

    /**
     * gives information about the faculty member
     * @return name, salary, and list of courses for the faculty member
     */
    public String toString() {
        String info = getName() + " earns " + getSalary() + "\nCourses:\n";
        for(int i = 0; i < courses.length; i++) {
            info += courses[i] + "\n";
        }
        return info;
    }
}
