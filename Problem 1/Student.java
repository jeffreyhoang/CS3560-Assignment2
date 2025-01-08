public class Student {
    private String name;
    private String major;
    private double gpa;

    // default constructor
    public Student() {
        this.name = "N/A";
        this.major = "N/A";
        this.gpa = 0.0;
    }

    // constructor with name and major
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
    }

    // constructor with name, major, and gpa
    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    // getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // getter and setter for gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // prints student information
    @Override
    public String toString() {
        return name + " is a " + major + " major with a GPA of " + gpa + ".";
    }

    // return whether the content of 2 Student objects are equal
    public boolean equals(Student student) {
        boolean status;

        if(name.equals(student.name) && major.equals(student.major) && gpa == student.gpa) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }
}